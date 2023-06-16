package com.bank.example.bank.demo.service.bankBrancheService;

import com.bank.example.bank.demo.model.bank.Bank;
import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.model.bank.TransferMonitoring;
import com.bank.example.bank.demo.model.client.Client;
import com.bank.example.bank.demo.model.client.TypeClient;
import com.bank.example.bank.demo.model.currency.*;
import com.bank.example.bank.demo.model.employee.EmployeeFunction;
import com.bank.example.bank.demo.model.employee.Employees;
import com.bank.example.bank.demo.repository.BankBranchRepository;
import com.bank.example.bank.demo.repository.BankRepository;
import com.bank.example.bank.demo.service.bankService.BankService;
import com.bank.example.bank.demo.service.bankService.BankServiceImpl;
import com.bank.example.bank.demo.service.clientService.ClientService;
import com.bank.example.bank.demo.service.clientService.ClientServiceImpl;
import com.bank.example.bank.demo.service.employeesService.EmployeesService;
import com.bank.example.bank.demo.service.exchangeCurrency.ExchangeCurrencyService;
import com.bank.example.bank.demo.service.transferMonitoring.TransferMonitoringService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Service
@Transactional
public class BankBrancheServiceImpl implements BankBrancheService {
    @Autowired
    private BankBranchRepository bankBranchRepository;


    @Override
    public void addBankBranche(BankBranche bankBranche) {
        System.out.println("service to add bankbrach");
        bankBranchRepository.save(bankBranche);
    }

    @Override
    public List<BankBranche> loadAllBankBranche() {
        System.out.println("service load all bank brach");
        return bankBranchRepository.findAll();
    }

    @Override
    public List<BankBranche> findBankBrancheByName(String name) {

        System.out.println("Service - Finding bank branches by name");
        List<BankBranche> bankBranches = new ArrayList<>();
        BankBranche bankBranche = null;
        try {
            bankBranche = bankBranchRepository.findBankBrancheByName(name);
            bankBranches.add(bankBranche);
        } catch (SQLException e) {
            e.printStackTrace();
            //TODO: trebui de afisare catre utlizator
        }
        return bankBranches;
    }

    @Override
    public List<BankBranche> findBankBrancheByAddress(String address) {
        List<BankBranche> bankBranches = new ArrayList<>();
        BankBranche bankBranche = null;
        System.out.println("Service - Finding bank branches by address");
        try {
            bankBranche = bankBranchRepository.findBankBrancheByAddress(address);
            bankBranches.add(bankBranche);
        } catch (SQLException e) {
            e.printStackTrace();
            //TODO: trebui de afisare catre utlizator
        }
        return bankBranches;
    }

    @Override
    public BankBranche getBankBrancheByID(long id) {
        System.out.println("service for find by id bankBrache");
        return bankBranchRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBankBrancheByID(long id) {
        System.out.println("Service - Deleting bank branch by ID");
        bankBranchRepository.deleteById(id);
    }

    @Override
    public void updateBankBranche(BankBranche bankBranche) {
        System.out.println("Service - Update bank branch");
        BankBranche existingBankBranche = bankBranchRepository.findById(bankBranche.getId()).orElse(null);
        if (existingBankBranche == null) {
            throw new RuntimeException("Bank branch not found");
        }
        existingBankBranche.setName(bankBranche.getName());
        existingBankBranche.setAddress(bankBranche.getAddress());
        existingBankBranche.setBrancheBalanceMDL(bankBranche.getBrancheBalanceMDL());
        existingBankBranche.setBrancheBalanceEUR(bankBranche.getBrancheBalanceEUR());
        existingBankBranche.setBrancheBalanceUSD(bankBranche.getBrancheBalanceUSD());
        existingBankBranche.setBrancheBalanceRON(bankBranche.getBrancheBalanceRON());

        bankBranchRepository.save(existingBankBranche);
    }

    @Override
    public void changeMoney(Client client, Currency toCurrency, BankBranche bankBranche) {

        List<Employees> employeesList = bankBranche.getEmployees();

        ExchangeCurrency exchangeCurrency = bankBranche.getExchangeCurrency();

        for (Employees employees : employeesList) {
            System.out.println(employees + " my employee is");
            if (employees.getFunction().equals(EmployeeFunction.CASIER)) {
                System.out.println("se deservest de ");
                if (client.getTypeClient().equals(TypeClient.CHANGE)) {
                    // MDL --> all
                    if (client.getTypeCurrensy().equals(com.bank.example.bank.demo.model.currency.Currency.MDL)
                            && toCurrency.equals(com.bank.example.bank.demo.model.currency.Currency.EUR)) {

                        bankBranche.setBrancheBalanceMDL(bankBranche.getBrancheBalanceMDL() + client.getAmountCurrency());
                        double changedMoney = client.getAmountCurrency() * exchangeCurrency.getBuyEUR();
                        client.setTypeCurrensy(com.bank.example.bank.demo.model.currency.Currency.EUR);
                        bankBranche.setBrancheBalanceEUR((long) (bankBranche.getBrancheBalanceEUR() - (changedMoney - 0.99)));
                        client.setAmountCurrency((long) (changedMoney - (changedMoney * 0.01))); // comisionul


                        System.out.println("================================================\n" + changedMoney);
                        //TODO:
                    }

                }
            }
        }

        //TODO: changeMoney
    }

    @Autowired
    private ClientService clientService;
    @Autowired
    private EmployeesService employeesService;

    @Override
    public void changeMoneyService(long idClient, Currency toCurrency, long idBankBranche, long idEmployee) {

        Client client = clientService.findClientByID(idClient);
        BankBranche bankBranche = getBankBrancheByID(idBankBranche);
        Employees employees = employeesService.findEmployeesByID(idEmployee);
        com.bank.example.bank.demo.model.currency.Currency currencyEUR = com.bank.example.bank.demo.model.currency.Currency.EUR;
        ExchangeCurrency exchangeCurrency = bankBranche.getExchangeCurrency();

        if (employees.getFunction().equals(EmployeeFunction.CASIER)) {
            System.out.println("se deservest de " + employees.getFirstName());
            if (client.getTypeClient().equals(TypeClient.CHANGE)) {
                // MDL --> all

                if (client.getTypeCurrensy().equals(com.bank.example.bank.demo.model.currency.Currency.MDL)) {

                    if (toCurrency.toString().equals(com.bank.example.bank.demo.model.currency.Currency.EUR.toString())) {

                        System.out.println("clientul schimba MDL to EUR");
                        bankBranche.setBrancheBalanceMDL(bankBranche.getBrancheBalanceMDL() + client.getAmountCurrency()); //luam bani MDL
                        double changedMoney = client.getAmountCurrency() / exchangeCurrency.getBuyEUR(); // impartim la curs EUR
                        client.setTypeCurrensy(com.bank.example.bank.demo.model.currency.Currency.EUR); // stiulam ca intoarecm euro
                        double recevedchangedMoney = changedMoney - (changedMoney * 0.2);
                        bankBranche.setBrancheBalanceEUR((long) (bankBranche.getBrancheBalanceEUR() - recevedchangedMoney)); // stocatem din banca bani
                        client.setAmountCurrency((long) recevedchangedMoney); // comisionul
                    }

                    if (toCurrency.toString().equals(com.bank.example.bank.demo.model.currency.Currency.USD.toString())) {

                        System.out.println("sclientul schimba MDL to USD");
                        bankBranche.setBrancheBalanceUSD(bankBranche.getBrancheBalanceMDL() + client.getAmountCurrency()); //luam bani MDL
                        double changedMoney = client.getAmountCurrency() / exchangeCurrency.getBuyUSD(); // impartim la curs usd
                        client.setTypeCurrensy(com.bank.example.bank.demo.model.currency.Currency.USD); // stiulam ca intoarecm euro
                        double recevedchangedMoney = changedMoney - (changedMoney * 0.2);
                        bankBranche.setBrancheBalanceUSD((long) (bankBranche.getBrancheBalanceUSD() - recevedchangedMoney)); // stocatem din banca bani
                        client.setAmountCurrency((long) recevedchangedMoney); // comisionul
                    }

                    if (toCurrency.toString().equals(com.bank.example.bank.demo.model.currency.Currency.RON.toString())) {

                        System.out.println("sclientul schimba MDL to RON");
                        bankBranche.setBrancheBalanceRON(bankBranche.getBrancheBalanceMDL() + client.getAmountCurrency()); //luam bani MDL
                        double changedMoney = client.getAmountCurrency() / exchangeCurrency.getBuyRON(); // impartim la curs usd
                        client.setTypeCurrensy(com.bank.example.bank.demo.model.currency.Currency.RON); // stiulam ca intoarecm euro
                        double recevedchangedMoney = changedMoney - (changedMoney * 0.2);
                        bankBranche.setBrancheBalanceRON((long) (bankBranche.getBrancheBalanceUSD() - recevedchangedMoney)); // stocatem din banca bani
                        client.setAmountCurrency((long) recevedchangedMoney); // comisionul
                    }

                }
            }
        }
    }
    @Autowired
    private TransferMonitoringService transferMonitoringService;
    @Override
    public void sendMoney(long idSendClient, long  idSendBankBranche, long idEmployeeFromSendBankBranche,
                          long idReciveClient, long idReceveBankBranke) {
        Client clientToSend = clientService.findClientByID(idSendClient);
        Client clientToReceive = clientService.findClientByID(idSendClient);
        BankBranche bankBrancheSend = getBankBrancheByID(idSendBankBranche);
        BankBranche bankBrancheReceive = getBankBrancheByID(idReceveBankBranke);
        Employees EmployeeFromSendBankBranche = employeesService.findEmployeesByID(idEmployeeFromSendBankBranche);


        if (EmployeeFromSendBankBranche.getFunction().equals(EmployeeFunction.CASIER)) {

            if (clientToSend.getTypeClient().equals(TypeClient.SEND)) {
                if(clientToSend.getTypeCurrensy().equals(com.bank.example.bank.demo.model.currency.Currency.MDL)){

                    /////////////
                    long sendMoney = clientToSend.getAmountCurrency();
                    bankBrancheSend.setBrancheBalanceMDL((long) (bankBrancheSend.getBrancheBalanceMDL() + sendMoney * 0.1));
                    clientToSend.setAmountCurrency(0);
                    // intrgistram in baza de date transferul
                    TransferMonitoring transferMonitoring = new TransferMonitoring(idSendClient, idReciveClient, sendMoney);
                    transferMonitoringService.addTransferMonitoring(transferMonitoring);
                    bankBrancheReceive.setBrancheBalanceMDL((long) (bankBrancheReceive.getBrancheBalanceMDL() + sendMoney * 0.9));


                }
                if(clientToSend.getTypeCurrensy().equals(com.bank.example.bank.demo.model.currency.Currency.EUR)){
                    System.out.println("Clientul trimite EUR");
                }
                if(clientToSend.getTypeCurrensy().equals(com.bank.example.bank.demo.model.currency.Currency.USD)){
                    System.out.println("Clientul trimite USD");
                }
                if(clientToSend.getTypeCurrensy().equals(com.bank.example.bank.demo.model.currency.Currency.RON)){
                    System.out.println("Clientul trimite RON");
                }
            }
        }








    }

    @Override
    public void receiveMoney(Client reciveClient, BankBranche receveBankBranke, Client sendClient, BankBranche sendBankBranche) {
//        long idEmployeeFromReceveBankBranke
//        Employees EmployeeFromReceveBankBrank = employeesService.findEmployeesByID(idEmployeeFromReceveBankBranke);
    }


}

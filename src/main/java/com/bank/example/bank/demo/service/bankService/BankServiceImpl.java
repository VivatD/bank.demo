package com.bank.example.bank.demo.service.bankService;

import com.bank.example.bank.demo.model.bank.Bank;
import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.repository.BankRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Currency;
import java.util.List;

@Service
@Transactional
public class BankServiceImpl implements BankService {
    @Autowired
    private BankRepository bankRepository;
    private Bank bank;
    private BankBranche bankBranch;

    public BankServiceImpl() {
        bank = new Bank();
        bankBranch = new BankBranche(bank);
    }


    // trebu de modificat
    public void addFunds(double amount, String currency) {
        Currency cur = Currency.getInstance(currency);
        bank.deposit(cur, amount);
        double taxAmount = amount * 0.05;
        bank.withdraw(cur, taxAmount);
        bankBranch.deposit(cur, taxAmount);
    }

    public void withdrawFunds(double amount, String currency) {
        Currency cur = Currency.getInstance(currency);
        bank.withdraw(cur, amount);
        double taxAmount = amount * 0.05;
        bank.withdraw(cur, taxAmount);
        bankBranch.deposit(cur, taxAmount);
    }

    public void openBankBranch() {
        bankBranch.open();
    }


//    public  void addFunds(Bank ank,long amuons, String currency){
//        if(currency.equals("MDL")){
//             bank.setBalanceMDL(bank.getBalanceMDL()+ amuons);
//        } else if (currency.equals("USD")) {
//            bank.setBalanceUSD(bank.getBalanceUSD()+ amuons);
//        } else if (currency.equals("EURO")) {
//            bank.setBalanceEUR(bank.getBalanceEUR()+ amuons);
//        } else if (currency.equals("RON")) {
//            bank.setBalanceRON(bank.getBalanceRON()+ amuons);
//        }
//    }
//    public void withdrawFunds(Bank bank,long amouns, String currency){
//        if(currency.equals("MDL")){
//            bank.setBalanceMDL(bank.getBalanceMDL() - amouns);
//        } else if (currency.equals("USD")) {
//            bank.setBalanceUSD(bank.getBalanceUSD() - amouns);
//        } else if (currency.equals("EURO")) {
//            bank.setBalanceEUR(bank.getBalanceEUR() - amouns);
//        } else if (currency.equals("RON")) {
//            bank.setBalanceRON(bank.getBalanceRON() - amouns);
//        }


    @Override
    public double getBalance() {
        return bank.getBalance();
    }

    @Override
    public void deposit(double amount) {
        bank.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        bank.withdraw(amount);
    }

    @Override
    public void addBank(Bank bank) {
        //TODO: exemplu
        System.out.println("service adding bank to central");
        bankRepository.save(bank);
    }

    @Override
    public List<Bank> loadAllBank() {
        //TODO: exmplu
        System.out.println("service loading all bank");
        return bankRepository.findAll();
    }

    @Override
    public Bank findBankByName(String name) throws SQLException {
        //TODO: trebui de implimentat
        System.out.println("Service - Finding banks by name");
        return bankRepository.findBankByName(name);
    }

    @Override
    public Bank findBankByAddress(String address) throws SQLException {
        //TODO: trebui de implimentat
        System.out.println("Service - Finding banks by address");
        return bankRepository.findBankByAddress(address);
    }

    @Override
    public Bank getBankById(long id) {
        System.out.println("Service - Getting bank by ID");
        return bankRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBankByID(long id) {
        //TODO: trebui de implimentat
        bankRepository.deleteById(id);
    }

    @Override
    public void updateBank(Bank bank) {
        //TODO: trebui de implimentat

        System.out.println("Service - Update bank");

        Bank existingBank = bankRepository.findById(bank.getId()).orElse(null);
        if (existingBank == null) {
            throw new RuntimeException("Bank not found");
        }

        existingBank.setName(bank.getName());
        existingBank.setAddress(bank.getAddress());
        existingBank.setBalanceMDL(bank.getBalanceMDL());
        existingBank.setBalanceUSD(bank.getBalanceUSD());
        existingBank.setBalanceEUR(bank.getBalanceEUR());
        existingBank.setBalanceRON(bank.getBalanceRON());

        bankRepository.save(existingBank);
    }

}



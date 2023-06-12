package com.bank.example.bank.demo.service.bankService;

import com.bank.example.bank.demo.model.bank.Bank;
import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.repository.BankRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Service
@Transactional
public class BankServiceImpl implements BankService {
    @Autowired
    private BankRepository bankRepository;
//    private Bank bank;
//    private BankBranche bankBranch;
//
//    public BankServiceImpl() {
//        bank = new Bank();
//        bankBranch = new BankBranche(bank);
//    }
//

    // trebu de modificat
//    public void addFunds(double amount, String currency) {
//        Currency cur = Currency.getInstance(currency);
//        bank.deposit(cur, amount);
//        double taxAmount = amount * 0.05;
//        bank.withdraw(cur, taxAmount);
//        bankBranch.deposit(cur, taxAmount);
//    }
//
//    public void withdrawFunds(double amount, String currency) {
//        Currency cur = Currency.getInstance(currency);
//        bank.withdraw(cur, amount);
//        double taxAmount = amount * 0.05;
//        bank.withdraw(cur, taxAmount);
//        bankBranch.deposit(cur, taxAmount);
//    }
//
//    public void openBankBranch() {
//        bankBranch.open();
//    }
//

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


//    @Override
//    public double getBalance() {
//        return bank.getBalance();
//    }
//
//    @Override
//    public void deposit(double amount) {
//        bank.deposit(amount);
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        bank.withdraw(amount);
//    }

    @Override
    public void addBank(Bank bank) {
        System.out.println("service adding bank  central");
        bankRepository.save(bank);
    }

    @Override
    public List<Bank> loadAllBank() {
        System.out.println("service loading all bank");
        return bankRepository.findAll();
    }

    @Override
    public  List<Bank>  findBankByName(String name)  {
        System.out.println("Service - Finding banks by name");
        List<Bank>  bankList = new ArrayList<>();
        Bank bank = null;
        try {
            bank =  bankRepository.findBankByName(name);
            bankList.add(bank);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return bankList;
    }

    @Override
    public  List<Bank>  findBankByAddress(String address)  {
        System.out.println("Service - Finding banks by address");
        List<Bank> bankList = new ArrayList<>();
        Bank bankAddres = null;

        try {
            bankAddres = bankRepository.findBankByAddress(address);
            bankList.add(bankAddres);
        } catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        return bankList;
    }

    @Override
    public Bank getBankById(long id) {
        System.out.println("Service - Getting bank by ID");
        return bankRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBankByID(long id) {
        bankRepository.deleteById(id);
    }

    @Override
    public void updateBank(Bank bank) {
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



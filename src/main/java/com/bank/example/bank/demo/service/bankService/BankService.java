package com.bank.example.bank.demo.service.bankService;

import com.bank.example.bank.demo.model.bank.Bank;

import java.util.LinkedHashMap;
import java.util.List;

public interface BankService {
    void addBank(Bank bank);
    List<Bank> loadAllBank();
    List<Bank> findBankByName(String name);
    List<Bank> findBankByAddress(String address);
    void deleteBankByID(long id);
    void updateBank(Bank bank);



}

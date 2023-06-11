package com.bank.example.bank.demo.service.bankBrancheService;

import com.bank.example.bank.demo.model.bank.Bank;
import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.repository.BankBranchRepository;

import java.util.List;

public interface BankBrancheService {
    void addBankBranche(BankBranche bankBranche);
    List<BankBranche> loadAllBankBranche();
    List<BankBranche> findBankBrancheByName(String name);
    List<BankBranche> findBankBrancheByAddress(String address);
    void deleteBankBrancheByID(long id);
    void updateBankBranche(BankBranche bankBranche);
}

package com.bank.example.bank.demo.service.bankBrancheService;

import com.bank.example.bank.demo.model.bank.BankBranche;

import java.sql.SQLException;
import java.util.List;

public interface BankBrancheService {
    void openBranch();
    void addBankBranche(BankBranche bankBranche);
    List<BankBranche> loadAllBankBranche();
    BankBranche findBankBrancheByName(String name) throws SQLException;
    BankBranche findBankBrancheByAddress(String address) throws SQLException;
    void deleteBankBrancheByID(long id);
    void updateBankBranche(BankBranche bankBranche);
}

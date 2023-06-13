package com.bank.example.bank.demo.service.bankBrancheService;

import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.model.client.Client;

import java.sql.SQLException;
import java.util.List;

public interface BankBrancheService {
    void openBranch();
    void addBankBranche(BankBranche bankBranche);
    List<BankBranche> loadAllBankBranche();
    List<BankBranche> findBankBrancheByName(String name);
    List<BankBranche> findBankBrancheByAddress(String address);
    BankBranche getBankBrancheByID(long id);
    void deleteBankBrancheByID(long id);
    void updateBankBranche(BankBranche bankBranche);

    void changeMoney(Client client, BankBranche bankBranche);
    void sendMoney(Client client, BankBranche bankBranche);
    void receiveMoney(Client client, BankBranche bankBranche);
}

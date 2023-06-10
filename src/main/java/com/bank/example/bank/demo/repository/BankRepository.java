package com.bank.example.bank.demo.repository;

import com.bank.example.bank.demo.model.bank.Bank;

import java.util.List;

interface BankRepository {
    // TODO: 10.06.2023   adauga de aduagare de banka
    // TODO: 10.06.2023   delete banka
    // TODO: 10.06.2023   update bank
    // TODO: 10.06.2023   citirea banci
    // TODO: 10.06.2023   facem interface pentru ele si apoi implementarile pentru ele

    void addBank(Bank bank);

    void deleteBank(Bank bank);

    void updateBank(Bank bank);

    Bank getBankById(long id);

    List<Bank>getAllBanks();
}

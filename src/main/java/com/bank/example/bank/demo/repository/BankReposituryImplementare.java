package com.bank.example.bank.demo.repository;

import com.bank.example.bank.demo.model.bank.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BankReposituryImplementare implements BankRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public BankReposituryImplementare(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public void addBank(Bank bank) {

    }

    @Override
    public void deleteBank(Bank bank) {

    }

    @Override
    public void updateBank(Bank bank) {

    }

    @Override
    public Bank getBankById(long id) {
        return null;
    }

    @Override
    public List<Bank> getAllBanks() {
        TypedQuery<Bank> query = entityManager.createQuery("SELECT b FROM Bank b", Bank.class);
        return query.getResultList();
    }
}

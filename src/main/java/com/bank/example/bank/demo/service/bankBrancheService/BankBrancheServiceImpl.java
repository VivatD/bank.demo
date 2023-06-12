package com.bank.example.bank.demo.service.bankBrancheService;

import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.repository.BankBranchRepository;
import com.bank.example.bank.demo.service.bankService.BankServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BankBrancheServiceImpl implements BankBrancheService {
    @Autowired
    private BankBranchRepository bankBranchRepository;

    @Override
    public void openBranch() {

    }

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
        } catch (SQLException e){
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
}

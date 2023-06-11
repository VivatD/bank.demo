package com.bank.example.bank.demo.service.bankBrancheService;

import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.repository.BankBranchRepository;
import com.bank.example.bank.demo.service.bankService.BankServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
@Transactional
public class BankBrancheServiceImpl extends BankServiceImpl implements BankBrancheService{
    @Autowired
    private BankBranchRepository bankBranchRepository;

    @Override
    public void openBranch() {

    }

    @Override
    public void addBankBranche(BankBranche bankBranche) {

        //TODO: exmplu
        System.out.println("service to add bankbrach");
        bankBranchRepository.save(bankBranche);
    }

    @Override
    public List<BankBranche> loadAllBankBranche() {
        //TODO: exmplu
        System.out.println("service load all bank brach");
        return bankBranchRepository.findAll();
    }

    @Override
    public BankBranche findBankBrancheByName(String name) throws SQLException {
        //TODO: trebui de implimentat
        System.out.println("Service - Finding bank branches by name");
        return bankBranchRepository.findBankBrancheByName(name);
    }

    @Override
    public BankBranche findBankBrancheByAddress(String address) throws SQLException {
        //TODO: trebui de implimentat
        System.out.println("Service - Finding bank branches by address");
        return bankBranchRepository.findBankBrancheByAddress(address);
    }

    @Override
    public void deleteBankBrancheByID(long id) {
        //TODO: trebui de implimentat
        System.out.println("Service - Deleting bank branch by ID");
        bankBranchRepository.deleteById(id);
    }

    @Override
    public void updateBankBranche(BankBranche bankBranche) {
        //TODO: trebui de implimentat
        System.out.println("Service - Update bank branch");
        BankBranche existingBankBranche = bankBranchRepository.findById(bankBranche.getId()).orElse(null);
        if (existingBankBranche == null) {
            throw new RuntimeException("Bank branch not found");
        }
        existingBankBranche.setName(bankBranche.getName());
        existingBankBranche.setAddress(bankBranche.getAddress());
        bankBranchRepository.save(existingBankBranche);
    }
}

package com.bank.example.bank.demo.service.bankBrancheService;

import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.repository.BankBranchRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class BankBrancheServiceImpl implements BankBrancheService{
    @Autowired
    private BankBranchRepository bankBranchRepository;
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
    public List<BankBranche> findBankBrancheByName(String name) {
        //TODO: trebui de implimentat
        return null;
    }

    @Override
    public List<BankBranche> findBankBrancheByAddress(String address) {
        //TODO: trebui de implimentat
        return null;
    }

    @Override
    public void deleteBankBrancheByID(long id) {
        //TODO: trebui de implimentat

    }

    @Override
    public void updateBankBranche(BankBranche bankBranche) {
        //TODO: trebui de implimentat

    }
}

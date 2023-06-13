package com.bank.example.bank.demo.controller;

import com.bank.example.bank.demo.model.bank.Bank;
import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.service.bankBrancheService.BankBrancheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankbranche")
public class BankBranchController {
    @Autowired
    private BankBrancheService bankBrancheService;

    @PostMapping("/add")
    public void addBankBranche(@RequestBody BankBranche bankBranche) {
        bankBrancheService.addBankBranche(bankBranche);
    }

    @GetMapping("/all")
    public List<BankBranche> getAllBank() {
        return bankBrancheService.loadAllBankBranche();
    }

    @GetMapping("/branchename/{brancheName}")
    public List<BankBranche> findBankBrancheByName(@PathVariable String brancheName) {
        return bankBrancheService.findBankBrancheByName(brancheName);
    }

    @GetMapping("/address/{brancheAddress}")
    public List<BankBranche> findBankBrancheByAddress(@PathVariable String brancheAddress) {
        return bankBrancheService.findBankBrancheByAddress(brancheAddress);
    }

    @GetMapping("/id/{id}")
    BankBranche getBankBrancheByID(@PathVariable long id) {
        return bankBrancheService.getBankBrancheByID(id);
    }

    @DeleteMapping("/id/{id}")
    void deleteBankBrancheByID(@PathVariable long id) {
        bankBrancheService.deleteBankBrancheByID(id);
    }

    @PutMapping("/update")
    void updateBankBrache(@RequestBody BankBranche bankBranche) {
        bankBrancheService.updateBankBranche(bankBranche);
    }


}

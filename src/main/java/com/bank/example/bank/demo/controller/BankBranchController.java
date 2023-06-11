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
    //TODO: pentru toater metodele din BankBranckeServiceImpl trebui de factu controller
}

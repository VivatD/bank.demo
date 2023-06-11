package com.bank.example.bank.demo.controller;

import com.bank.example.bank.demo.model.bank.Bank;
import com.bank.example.bank.demo.model.client.Client;
import com.bank.example.bank.demo.service.bankService.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping("/add")
    public void addBank(@RequestBody Bank bank) {
        bankService.addBank(bank);
    }

    @GetMapping("/all")
    public List<Bank> getAllBank() {
        return bankService.loadAllBank();
    }

    //TODO: pentru toater metodele din BankServiceImpl trebui de factu controller
}

package com.bank.example.bank.demo.service;

import com.bank.example.bank.demo.model.bank.Bank;

public class BankService  {
    private  Bank bank;

    private  BankService(Bank bank){
        this.bank = bank;
    }
    // Metode pentru a actualiza balanța băncii
    public  void addFunds(long amuons, String currency){
        if(currency.equals("MDL")){
             bank.setBalanceMDL(bank.getBalanceMDL()+ amuons);
        } else if (currency.equals("USD")) {
            bank.setBalanceUSD(bank.getBalanceUSD()+ amuons);
        } else if (currency.equals("EURO")) {
            bank.setBalanceEUR(bank.getBalanceEUR()+ amuons);
        } else if (currency.equals("RON")) {
            bank.setBalanceRON(bank.getBalanceRON()+ amuons);
        }
    }
    public void withdrawFunds(long amouns, String currency){
        if(currency.equals("MDL")){
            bank.setBalanceMDL(bank.getBalanceMDL() - amouns);
        } else if (currency.equals("USD")) {
            bank.setBalanceUSD(bank.getBalanceUSD() - amouns);
        } else if (currency.equals("EURO")) {
            bank.setBalanceEUR(bank.getBalanceEUR() - amouns);
        } else if (currency.equals("RON")) {
            bank.setBalanceRON(bank.getBalanceRON() - amouns);
        }

    }

}

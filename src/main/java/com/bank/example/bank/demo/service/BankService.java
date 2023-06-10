package com.bank.example.bank.demo.service;

public class BankService  {
    // Metode pentru a actualiza balanța băncii
    public  void addFunds(long amuons, String currency){
        if(currency.equals("MDL")){
             balanceMDL = amuons;
        } else if (currency.equals("USD")) {
            balanceUSD += amuons;
        } else if (currency.equals("EURO")) {
            balanceEUR += amuons;
        } else if (currency.equals("RON")) {
            balanceRON += amuons;
        }
    }
    public void withdrawFunds(long amouns, String currency){
        if(currency.equals("MDL")){
            balanceMDL += amouns;
        } else if (currency.equals("USD")) {
            balanceUSD += amouns;
        } else if (currency.equals("EURO")) {
            balanceEUR += amouns;
        } else if (currency.equals("RON")) {
            balanceRON += amouns;
        }

    }

}

package com.bank.example.bank.demo.model.bank;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "balance_MDL")
    private long balanceMDL;

    @Column(name = "balance_EUR")
    private long balanceEUR;

    @Column(name = "balance_USD")
    private long balanceUSD;

    @Column(name = "balance_RON")
    private long balanceRON;

    @OneToMany(mappedBy = "bank")
    private List<BankBranche> bankBrancheList = new ArrayList<>();

//    private double balance;
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//        } else {
//            System.out.println("Insufficient funds");
//        }
//    }



    public Bank() {
    }

    public Bank(long id, String name, String address, long balanceMDL, long balanceEUR, long balanceUSD,
                long balanceRON, List<BankBranche> bankBrancheList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.balanceMDL = balanceMDL;
        this.balanceEUR = balanceEUR;
        this.balanceUSD = balanceUSD;
        this.balanceRON = balanceRON;
        this.bankBrancheList = bankBrancheList;
    }

    public Bank(String name, String address, long balanceMDL, long balanceEUR, long balanceUSD,
                long balanceRON, List<BankBranche> bankBrancheList) {
        this.name = name;
        this.address = address;
        this.balanceMDL = balanceMDL;
        this.balanceEUR = balanceEUR;
        this.balanceUSD = balanceUSD;
        this.balanceRON = balanceRON;
        this.bankBrancheList = bankBrancheList;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<BankBranche> getBankBrancheList() {
        return bankBrancheList;
    }

    public void setBankBrancheList(List<BankBranche> bankBrancheList) {
        this.bankBrancheList = bankBrancheList;
    }

    public long getBalanceMDL() {
        return balanceMDL;
    }

    public void setBalanceMDL(long balanceMDL) {
        balanceMDL = balanceMDL;
    }

    public long getBalanceUSD() {
        return balanceUSD;
    }

    public void setBalanceUSD(long balanceUSD) {
        balanceUSD = balanceUSD;
    }

    public long getBalanceEUR() {
        return balanceEUR;
    }

    public void setBalanceEUR(long balanceEUR) {
        balanceEUR = balanceEUR;
    }

    public long getBalanceRON() {
        return balanceRON;
    }

    public void setBalanceRON(long balanceRON) {
        balanceRON = balanceRON;
    }

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "bank")
//    private BankBranche bankBranche;
//
//    public BankBranche getBankBranche() {
//        return bankBranche;
//    }
//
//    public void setBankBranch(BankBranche bankBranche) {
//        this.bankBranche = bankBranche;
//    }
//
//    public void deposit(Currency cur, double amount) {
//    }
//
//    public void withdraw(Currency cur, double taxAmount) {
//    }


    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", balanceMDL=" + balanceMDL +
                ", balanceEUR=" + balanceEUR +
                ", balanceUSD=" + balanceUSD +
                ", balanceRON=" + balanceRON +
                ", bankBrancheList=" + bankBrancheList +
                '}';
    }
}

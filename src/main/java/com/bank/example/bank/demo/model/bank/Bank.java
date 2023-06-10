package com.bank.example.bank.demo.model.bank;
import jakarta.persistence.*;

import java.util.ArrayList;
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
    @OneToMany(mappedBy = "bank")
    private List<BankBranche> bankBrancheList = new ArrayList<>();

    @Column(name = "balance_MDL")
    private long balanceMDL;

    @Column(name = "balance_EUR")
    private long balanceEUR;

    @Column(name = "balance_USD")
    private long balanceUSD;

    @Column(name = "balance_RON")
    private long balanceRON;

    public Bank() {
    }
    public Bank(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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


}

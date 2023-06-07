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

//    @Column(name = "BalanceMDL")
//    private long BalanceMDL;
//    @Column(name = "BalanceEUR")
//    private long BalanceEUR;
//    @Column(name = "BalanceUSD")
//    private long BalanceUSD;
//    @Column(name = "BalanceRON")
//    private long BalanceRON;



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
//    public long getBalanceMDL() {
//        return BalanceMDL;
//    }
//    public void setBalanceMDL(long balanceMDL) {
//        BalanceMDL = balanceMDL;
//    }
//    public long getBalanceUSD() {
//        return BalanceUSD;
//    }
//
//    public void setBalanceUSD(long balanceUSD) {
//        BalanceUSD = balanceUSD;
//    }
//
//    public long getBalanceEUR() {
//        return BalanceEUR;
//    }
//
//    public void setBalanceEUR(long balanceEUR) {
//        BalanceEUR = balanceEUR;
//    }
//
//    public long getBalanceRON() {
//        return BalanceRON;
//    }
//
//    public void setBalanceRON(long balanceRON) {
//        BalanceRON = balanceRON;
//    }


}

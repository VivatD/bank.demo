package com.bank.example.bank.demo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank_branche")
public class BankBranche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_branche_id")
    private long id;
    @Column(name = "branche_name")
    private String name;
    @Column(name = "branche_address")
    private String address;

//    @Column(name = "branche_mdl")
//    private long BrancheBalanceMDL;
//    @Column(name = "branche_usd")
//    private long BrancheBalanceUSD;
//    @Column(name = "branche_eur")
//    private long BrancheBalanceEUR;
//    @Column(name = "branche_ron")
//    private long BrancheBalanceRON;

    @ManyToOne
    private Bank bank;
    @OneToMany(mappedBy = "bankBranche")
    private List<Employees> employees = new ArrayList<>();

    public BankBranche(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
//        this.BrancheBalanceMDL = brancheBalanceMDL;
//        this.BrancheBalanceUSD = brancheBalanceUSD;
//        this.BrancheBalanceEUR = brancheBalanceEUR;
//        this.BrancheBalanceRON = brancheBalanceRON;
    }

    public BankBranche() {

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
//
//    public long getBrancheBalanceMDL() {
//        return BrancheBalanceMDL;
//    }
//
//    public void setBrancheBalanceMDL(long brancheBalanceMDL) {
//        BrancheBalanceMDL = brancheBalanceMDL;
//    }
//
//    public long getBrancheBalanceUSD() {
//        return BrancheBalanceUSD;
//    }
//
//    public void setBrancheBalanceUSD(long brancheBalanceUSD) {
//        BrancheBalanceUSD = brancheBalanceUSD;
//    }
//
//    public long getBrancheBalanceEUR() {
//        return BrancheBalanceEUR;
//    }
//
//    public void setBrancheBalanceEUR(long brancheBalanceEUR) {
//        BrancheBalanceEUR = brancheBalanceEUR;
//    }
//
//    public long getBrancheBalanceRON() {
//        return BrancheBalanceRON;
//    }
//
//    public void setBrancheBalanceRON(long brancheBalanceRON) {
//        BrancheBalanceRON = brancheBalanceRON;
//    }
}

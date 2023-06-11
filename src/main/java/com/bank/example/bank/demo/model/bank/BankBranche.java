package com.bank.example.bank.demo.model.bank;

import com.bank.example.bank.demo.model.client.Client;
import com.bank.example.bank.demo.model.employee.Employees;
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
   // @OneToMany(mappedBy = "bank_branche")
   @OneToMany
    private List<Employees> employees = new ArrayList<>();

    //@OneToMany(mappedBy = "bankbranch", cascade = CascadeType.ALL)
    @OneToMany
    private List<Client> clientList = new ArrayList<>();

    public BankBranche(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
//        this.BrancheBalanceMDL = brancheBalanceMDL;
//        this.BrancheBalanceUSD = brancheBalanceUSD;
//        this.BrancheBalanceEUR = brancheBalanceEUR;
//        this.BrancheBalanceRON = brancheBalanceRON;
    }

    public BankBranche(String name, String address, Bank bank, List<Employees> employees,
                       List<Client> clientList) {
        this.name = name;
        this.address = address;
        this.bank = bank;
        this.employees = employees;
        this.clientList = clientList;
    }

    public BankBranche(long id, String name, String address, Bank bank,
                       List<Employees> employees, List<Client> clientList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bank = bank;
        this.employees = employees;
        this.clientList = clientList;
    }

    public BankBranche() {

    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
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

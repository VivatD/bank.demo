package com.bank.example.bank.demo.model.bank;

import com.bank.example.bank.demo.model.client.Client;
import com.bank.example.bank.demo.model.employee.Employees;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Currency;
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

    @Column(name = "branche_mdl")
    private long BrancheBalanceMDL;
    @Column(name = "branche_usd")
    private long BrancheBalanceUSD;
    @Column(name = "branche_eur")
    private long BrancheBalanceEUR;
    @Column(name = "branche_ron")
    private long BrancheBalanceRON;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_id")
    private Bank bank;
    // @OneToMany(mappedBy = "bank_branche")
    @OneToMany
    private List<Employees> employees = new ArrayList<>();

    //@OneToMany(mappedBy = "bankbranch", cascade = CascadeType.ALL)
    @OneToMany
    private List<Client> clientList = new ArrayList<>();



    public BankBranche(Bank bank) {
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
//    public void deposit(Currency currency, double amount) {
//
//        if (amount <= 0) {
//            System.out.println("Amount must be greater than zero.");
//            return;
//        }
//
//
//        if (!isCurrencyAccepted(currency)) {
//            System.out.println("Currency not accepted by the bank branch.");
//            return;
//        }
//
//
//        performDepositOperations(currency, amount);
//    }
//
//    private boolean isCurrencyAccepted(Currency currency) {
//
//        return true;
//    }
//
//    private void performDepositOperations(Currency currency, double amount) {
//
//
//        if (currency.equals(Currency.getInstance("MDL"))) {
//            System.out.println("actualizați soldul în MDL");
//        } else if (currency.equals(Currency.getInstance("USD"))) {
//            System.out.println("actualizați soldul în USD");
//        } else if (currency.equals(Currency.getInstance("EUR"))) {
//            System.out.println("actualizați soldul în EUR");
//        } else if (currency.equals(Currency.getInstance("RON"))) {
//            System.out.println("actualizați soldul în RON");
//        }
//    }
//
//    public void open() {
//        System.out.println("Bank branch is now open!");
//    }
//
//    public void openBranch() {
//        System.out.println("New bank branch opened");
//    }
//
//    public void deposit1(Currency currency, double amount) {
//        if (currency.equals(Currency.getInstance("MDL"))) {
//            System.out.println("actualizați soldul în MDL");
//        } else if (currency.equals(Currency.getInstance("USD"))) {
//            System.out.println("actualizați soldul în USD");
//        } else if (currency.equals(Currency.getInstance("EUR"))) {
//            System.out.println("actualizați soldul în EUR");
//        } else if (currency.equals(Currency.getInstance("RON"))) {
//            System.out.println("actualizați soldul în RON");
//        }
//    }

}

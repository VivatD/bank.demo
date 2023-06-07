package com.bank.example.bank.demo.model.currency;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "ExchangeCurrency")
public class ExchangeCurrency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idExchangeCurrency;
    @Column(name = "MDL")
    private long MDL;
    @Column(name = "USD")
    private long USD;
    @Column(name = "EUR")
    private long EUR;
    @Column(name = "RON")
    private long RON;
    @Column(name = "date")
    private Date date;

    public ExchangeCurrency() {
    }

    public ExchangeCurrency(long idExchangeCurrency, long MDL, long USD, long EUR, long RON, Date date) {
        this.idExchangeCurrency = idExchangeCurrency;
        this.MDL = MDL;
        this.USD = USD;
        this.EUR = EUR;
        this.RON = RON;
        this.date = date;
    }

    public long getIdExchangeCurrency() {
        return idExchangeCurrency;
    }

    public void setIdExchangeCurrency(long idExchangeCurrency) {
        this.idExchangeCurrency = idExchangeCurrency;
    }

    public long getMDL() {
        return MDL;
    }

    public void setMDL(long MDL) {
        this.MDL = MDL;
    }

    public long getUSD() {
        return USD;
    }

    public void setUSD(long USD) {
        this.USD = USD;
    }

    public long getEUR() {
        return EUR;
    }

    public void setEUR(long EUR) {
        this.EUR = EUR;
    }

    public long getRON() {
        return RON;
    }

    public void setRON(long RON) {
        this.RON = RON;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}

package com.bank.example.bank.demo.model.currency;

import com.bank.example.bank.demo.model.bank.BankBranche;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "ExchangeCurrency")
public class ExchangeCurrency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idExchangeCurrency;
    @Column(name = "sellMDL")
    private long sellMDL;
    @Column(name = "buyMDL")
    private long buyMDL;
    @Column(name = "sellUSD")
    private long sellUSD;
    @Column(name = "buyUSD")
    private long buyUSD;
    @Column(name = "sellEUR")
    private long sellEUR;
    @Column(name = "buyEUR")
    private long buyEUR;
    @Column(name = "sellRON")
    private long sellRON;
    @Column(name = "buyRON")
    private long buyRON;
    @OneToOne
    @JoinColumn(name = "idExchangeCurrency", referencedColumnName = "branche_id")
    private BankBranche bankBranche;
    @Column(name = "date")
    private Date date;

    public ExchangeCurrency() {
    }

    public ExchangeCurrency(long idExchangeCurrency, long sellMDL, long buyMDL, long sellUSD, long buyUSD,
                            long sellEUR, long buyEUR, long sellRON, long buyRON, BankBranche bankBranche, Date date) {
        this.idExchangeCurrency = idExchangeCurrency;
        this.sellMDL = sellMDL;
        this.buyMDL = buyMDL;
        this.sellUSD = sellUSD;
        this.buyUSD = buyUSD;
        this.sellEUR = sellEUR;
        this.buyEUR = buyEUR;
        this.sellRON = sellRON;
        this.buyRON = buyRON;
        this.bankBranche = bankBranche;
        this.date = date;
    }

    public ExchangeCurrency(long sellMDL, long buyMDL, long sellUSD, long buyUSD, long sellEUR, long buyEUR,
                            long sellRON, long buyRON, BankBranche bankBranche, Date date) {
        this.sellMDL = sellMDL;
        this.buyMDL = buyMDL;
        this.sellUSD = sellUSD;
        this.buyUSD = buyUSD;
        this.sellEUR = sellEUR;
        this.buyEUR = buyEUR;
        this.sellRON = sellRON;
        this.buyRON = buyRON;
        this.bankBranche = bankBranche;
        this.date = date;
    }

    public long getIdExchangeCurrency() {
        return idExchangeCurrency;
    }

    public void setIdExchangeCurrency(long idExchangeCurrency) {
        this.idExchangeCurrency = idExchangeCurrency;
    }

    public long getSellMDL() {
        return sellMDL;
    }

    public void setSellMDL(long sellMDL) {
        this.sellMDL = sellMDL;
    }

    public long getBuyMDL() {
        return buyMDL;
    }

    public void setBuyMDL(long buyMDL) {
        this.buyMDL = buyMDL;
    }

    public long getSellUSD() {
        return sellUSD;
    }

    public void setSellUSD(long sellUSD) {
        this.sellUSD = sellUSD;
    }

    public long getBuyUSD() {
        return buyUSD;
    }

    public void setBuyUSD(long buyUSD) {
        this.buyUSD = buyUSD;
    }

    public long getSellEUR() {
        return sellEUR;
    }

    public void setSellEUR(long sellEUR) {
        this.sellEUR = sellEUR;
    }

    public long getBuyEUR() {
        return buyEUR;
    }

    public void setBuyEUR(long buyEUR) {
        this.buyEUR = buyEUR;
    }

    public long getSellRON() {
        return sellRON;
    }

    public void setSellRON(long sellRON) {
        this.sellRON = sellRON;
    }

    public long getBuyRON() {
        return buyRON;
    }

    public void setBuyRON(long buyRON) {
        this.buyRON = buyRON;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BankBranche getBankBranche() {
        return bankBranche;
    }

    public void setBankBranche(BankBranche bankBranche) {
        this.bankBranche = bankBranche;
    }

    @Override
    public String toString() {
        return "ExchangeCurrency{" +
                "idExchangeCurrency=" + idExchangeCurrency +
                ", sellMDL=" + sellMDL +
                ", buyMDL=" + buyMDL +
                ", sellUSD=" + sellUSD +
                ", buyUSD=" + buyUSD +
                ", sellEUR=" + sellEUR +
                ", buyEUR=" + buyEUR +
                ", sellRON=" + sellRON +
                ", buyRON=" + buyRON +
                ", bankBranche=" + bankBranche +
                ", date=" + date +
                '}';
    }
}

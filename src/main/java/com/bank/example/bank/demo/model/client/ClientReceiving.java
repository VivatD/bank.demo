package com.bank.example.bank.demo.model.client;

import com.bank.example.bank.demo.model.currency.Currency;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_receiving")
public class ClientReceiving extends Client{
    @Column(name = "receving_destiation")
    private String recevingDestiation;
    @Column(name = "type_currensy")
    private Currency typeCurrensy;
    @Column(name = "amount_currency")
    private long amountCurrency;

    public ClientReceiving(){

    }

    public ClientReceiving(String recevingDestiation, Currency typeCurrensy, long amountCurrency) {
        this.recevingDestiation = recevingDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
    }

    public ClientReceiving(String firstName, String lastName, String idnp, String phoneNumber, String recevingDestiation, Currency typeCurrensy, long amountCurrency) {
        super(firstName, lastName, idnp, phoneNumber);
        this.recevingDestiation = recevingDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
    }

    public ClientReceiving(long idClient, String firstName, String lastName, String idnp, String phoneNumber, String recevingDestiation, Currency typeCurrensy, long amountCurrency) {
        super(idClient, firstName, lastName, idnp, phoneNumber);
        this.recevingDestiation = recevingDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
    }

    public String getRecevingDestiation() {
        return recevingDestiation;
    }

    public void setRecevingDestiation(String recevingDestiation) {
        this.recevingDestiation = recevingDestiation;
    }

    public Currency getTypeCurrensy() {
        return typeCurrensy;
    }

    public void setTypeCurrensy(Currency typeCurrensy) {
        this.typeCurrensy = typeCurrensy;
    }

    public long getAmountCurrency() {
        return amountCurrency;
    }

    public void setAmountCurrency(long amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    @Override
    public String toString() {
        return "ClientReceiving{" +
                "recevingDestiation='" + recevingDestiation + '\'' +
                ", typeCurrensy=" + typeCurrensy +
                ", amountCurrency=" + amountCurrency +
                '}';
    }
}

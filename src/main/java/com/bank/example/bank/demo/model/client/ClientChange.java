package com.bank.example.bank.demo.model.client;

import com.bank.example.bank.demo.model.currency.Currency;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_change")
public class ClientChange extends Client{
    @Column(name = "type_currensy")
    private Currency typeCurrensy;
    @Column(name = "amount_currency")
    private long amountCurrency;

    public ClientChange(){

    }

    public ClientChange(String firstName, String lastName, String idnp, String phoneNumber, Currency typeCurrensy,
                        long amountCurrency) {
        super(firstName, lastName, idnp, phoneNumber);
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
    }

    public ClientChange(long idClient, String firstName, String lastName, String idnp, String phoneNumber,
                        Currency typeCurrensy, long amountCurrency) {
        super(idClient, firstName, lastName, idnp, phoneNumber);
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
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
        return "ClientChange{" +
                "typeCurrensy=" + typeCurrensy +
                ", amountCurrency=" + amountCurrency +
                '}';
    }
}

package com.bank.example.bank.demo.model.client;

import com.bank.example.bank.demo.model.currency.Currency;

public class ClinetSend extends Client{

    private String sendDestiation;
    private Currency typeCurrensy;
    private long amountCurrency;
    private ClientReceiving clientReceiving;
    public ClinetSend(){

    }

    public ClinetSend(String sendDestiation, Currency typeCurrensy, long amountCurrency, ClientReceiving clientReceiving) {
        this.sendDestiation = sendDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
        this.clientReceiving = clientReceiving;
    }

    public ClinetSend(String firstName, String lastName, String idnp, String phoneNumber, String sendDestiation, Currency typeCurrensy, long amountCurrency, ClientReceiving clientReceiving) {
        super(firstName, lastName, idnp, phoneNumber);
        this.sendDestiation = sendDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
        this.clientReceiving = clientReceiving;
    }

    public ClinetSend(long idClient, String firstName, String lastName, String idnp, String phoneNumber, String sendDestiation, Currency typeCurrensy, long amountCurrency, ClientReceiving clientReceiving) {
        super(idClient, firstName, lastName, idnp, phoneNumber);
        this.sendDestiation = sendDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
        this.clientReceiving = clientReceiving;
    }

    public String getSendDestiation() {
        return sendDestiation;
    }

    public void setSendDestiation(String sendDestiation) {
        this.sendDestiation = sendDestiation;
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

    public ClientReceiving getClientReceiving() {
        return clientReceiving;
    }

    public void setClientReceiving(ClientReceiving clientReceiving) {
        this.clientReceiving = clientReceiving;
    }


    @Override
    public String toString() {
        return "ClinetSend{" +
                "sendDestiation='" + sendDestiation + '\'' +
                ", typeCurrensy=" + typeCurrensy +
                ", amountCurrency=" + amountCurrency +
                ", clientReceiving=" + clientReceiving +
                '}';
    }
}

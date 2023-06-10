package com.bank.example.bank.demo.model.client;

import com.bank.example.bank.demo.model.currency.Currency;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinet_send")
public class ClinetSend extends Client{
    @Column(name = "send_destiation")
    private String sendDestiation;
    @Column(name = "type_currensy")
    private Currency typeCurrensy;
    @Column(name = "amount_currency")
    private long amountCurrency;
  //  private ClientReceiving clientReceiving;
    public ClinetSend(){

    }

    public ClinetSend(String sendDestiation, Currency typeCurrensy, long amountCurrency) {
        this.sendDestiation = sendDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;
   //     this.clientReceiving = clientReceiving;
    }

    public ClinetSend(String firstName, String lastName, String idnp, String phoneNumber, String sendDestiation, Currency typeCurrensy, long amountCurrency) {
        super(firstName, lastName, idnp, phoneNumber);
        this.sendDestiation = sendDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;

    }

    public ClinetSend(long idClient, String firstName, String lastName, String idnp, String phoneNumber, String sendDestiation, Currency typeCurrensy, long amountCurrency) {
        super(idClient, firstName, lastName, idnp, phoneNumber);
        this.sendDestiation = sendDestiation;
        this.typeCurrensy = typeCurrensy;
        this.amountCurrency = amountCurrency;

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

//    public ClientReceiving getClientReceiving() {
//        return clientReceiving;
//    }
//
//    public void setClientReceiving(ClientReceiving clientReceiving) {
//        this.clientReceiving = clientReceiving;
//    }


    @Override
    public String toString() {
        return "ClinetSend{" +
                "sendDestiation='" + sendDestiation + '\'' +
                ", typeCurrensy=" + typeCurrensy +
                ", amountCurrency=" + amountCurrency +
                ", clientReceiving=" +
                '}';
    }
}

package com.bank.example.bank.demo.model.bank;

import jakarta.persistence.*;

@Entity
@Table(name = "transfer")
public class TransferMonitoring {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idTransfer;
    @Column(name = "client_send")
    private long idClientSend;
    @Column(name = "Client_recevie")
    private long idClientRecevie;
    @Column(name = "amount_send")
    private long amountSend;

    public TransferMonitoring() {
    }

    public TransferMonitoring(long idTransfer, long idClientSend, long idClientRecevie, long amountSend) {
        this.idTransfer = idTransfer;
        this.idClientSend = idClientSend;
        this.idClientRecevie = idClientRecevie;
        this.amountSend = amountSend;
    }

    public TransferMonitoring(long idClientSend, long idClientRecevie, long amountSend) {
        this.idClientSend = idClientSend;
        this.idClientRecevie = idClientRecevie;
        this.amountSend = amountSend;
    }

    public long getAmountSend() {
        return amountSend;
    }

    public void setAmountSend(long amountSend) {
        this.amountSend = amountSend;
    }

    public long getIdTransfer() {
        return idTransfer;
    }

    public void setIdTransfer(long idTransfer) {
        this.idTransfer = idTransfer;
    }

    public long getIdClientSend() {
        return idClientSend;
    }

    public void setIdClientSend(long idClientSend) {
        this.idClientSend = idClientSend;
    }

    public long getIdClientRecevie() {
        return idClientRecevie;
    }

    public void setIdClientRecevie(long idClientRecevie) {
        this.idClientRecevie = idClientRecevie;
    }

    @Override
    public String toString() {
        return "TransferMonitoring{" +
                "idTransfer=" + idTransfer +
                ", idClientSend=" + idClientSend +
                ", idClientRecevie=" + idClientRecevie +
                '}';
    }
}

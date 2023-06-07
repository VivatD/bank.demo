package com.bank.example.bank.demo.model.client;

public class Client {
    private long idClient;
    private String firstName;
    private String lastName;

    private String idnp;
    private String phoneNumber;

    public Client() {
    }

    public Client(String firstName, String lastName, String idnp, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idnp = idnp;
        this.phoneNumber = phoneNumber;
    }

    public Client(long idClient, String firstName, String lastName, String idnp, String phoneNumber) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idnp = idnp;
        this.phoneNumber = phoneNumber;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

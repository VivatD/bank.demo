package com.bank.example.bank.demo.model.client;

import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.model.currency.Currency;
import com.bank.example.bank.demo.model.currency.ExchangeCurrency;
import com.bank.example.bank.demo.model.employee.Employees;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private List<Employees> employeeList = null;
    private List<Client> clientList = null;
    private ExchangeCurrency exchangeCurrency= null;
   private BankBranche bankBranche = new BankBranche(1,"Filiala nr1","chisinau",1,
           1,1,1,employeeList, clientList, exchangeCurrency);
  private   Client client = new Client(1,"Andrei","Moroz","012849151",
          "079586213",TypeClient.SEND, Currency.EUR,100,bankBranche);

    @Test
    void getFirstName() {
        assertEquals("Andrei", client.getFirstName());
         }

    @Test
    void getLastName() {
        assertEquals("Moroz", client.getLastName());
    }

    @Test
    void getAmountCurrency() {
        assertEquals(100, client.getAmountCurrency());
    }

    @Test
    void getTypeClient() {
        assertEquals(TypeClient.SEND, client.getTypeClient());
    }

    @Test
    void getIdnp() {
        assertEquals("012849151", client.getIdnp());
    }

    @Test
    void getIdClient() {
        assertEquals(1,client.getIdClient());
    }



    @Test
    void getPhoneNumber() {
        assertEquals("079586213", client.getPhoneNumber());
    }

    @Test
    void getBankBranche() {
        assertEquals(bankBranche, client.getBankBranche());
    }

    @Test
    void getTypeCurrensy() {
        assertEquals(Currency.EUR, client.getTypeCurrensy());
    }


}
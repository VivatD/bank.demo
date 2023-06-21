package com.bank.example.bank.demo.model.employee;

import com.bank.example.bank.demo.model.bank.BankBranche;
import com.bank.example.bank.demo.model.client.Client;
import com.bank.example.bank.demo.model.currency.ExchangeCurrency;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {
    private List<Employees> employeeList = null;
    private List<Client> clientList = null;
    private ExchangeCurrency exchangeCurrency= null;
    private BankBranche bankBranche = new BankBranche(1,"Filiala nr1","chisinau",1,
            1,1,1,employeeList, clientList, exchangeCurrency);

    private Employees employees = new Employees(1,"Nicolae","Ghermacovschi", "078852149", EmployeeFunction.CASIER, bankBranche);


    @Test
    void getId() {
    }

    @Test
    void getFirstName() {
        assertEquals("Nicolae",employees.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Ghermacovschi",employees.getLastName());
    }

    @Test
    void getMobileNumber() {
        assertEquals("078852149", employees.getMobileNumber());
    }

    @Test
    void getFunction() {
        assertEquals(EmployeeFunction.CASIER, employees.getFunction());
    }
}
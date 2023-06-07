package com.bank.example.bank.demo.model.employee;

import com.bank.example.bank.demo.model.bank.BankBranche;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employees {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "employee_function")
    private EmployeeFunction function;

    @ManyToOne
    private BankBranche bankBranche;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public EmployeeFunction getFunction() {
        return function;
    }

    public void setFunction(EmployeeFunction function) {
        this.function = function;
    }
}

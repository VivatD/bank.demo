package com.bank.example.bank.demo.service.EmployeesService;

import com.bank.example.bank.demo.model.employee.EmployeeFunction;
import com.bank.example.bank.demo.model.employee.Employees;
import com.bank.example.bank.demo.repository.EmployeesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesRepository employeesRepository;
    @Override
    public void addEmployees(Employees employees) {
        //TODO: Logica trebuie
    }

    @Override
    public List<Employees> loadAllEmployees() {
        //TODO: Logica trebuie
        return null;
    }

    @Override
    public List<Employees> loadAllEmployeesByBrancheID(long idBrache) {
        //TODO: Logica trebuie
        return null;
    }

    @Override
    public List<Employees> findEmployeesByFirstName(String firstName) {
        //TODO: Logica trebuie
        return null;
    }

    @Override
    public List<Employees> findEmployeesByLastName(String lastName) {
        //TODO: Logica trebuie
        return null;
    }

    @Override
    public List<Employees> findEmployeesByFunction(EmployeeFunction employeeFunction) {
        //TODO: Logica trebuie
        return null;
    }

    @Override
    public Employees findEmployeesByID(long id) {
        //TODO: Logica trebuie
        return null;
    }

    @Override
    public void deleteEmployeesByID(long id) {
        //TODO: Logica trebuie

    }

    @Override
    public void updateEmployees(Employees employees) {
        //TODO: Logica trebuie

    }
}

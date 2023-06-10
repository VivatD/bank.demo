package com.bank.example.bank.demo.repository.clientRepository;

import com.bank.example.bank.demo.model.client.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientRepository {

    List<Client> findClientByName(String firstName) throws SQLException;
    Client findClientByINDP(String idnp) throws SQLException;
    Client findClientByID(long id) throws SQLException;


}

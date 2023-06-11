package com.bank.example.bank.demo.service.ClientService;

import com.bank.example.bank.demo.model.client.Client;

import java.util.List;

public interface ClientService {
    void addClient(Client client);

    List<Client> loadAllClient();

    List<Client> findClientByFirstName(String firstName);

    List<Client> findClientByLastName(String lastName);

    Client findClientByIdnp(String idnp);

    Client findClientByID(long id);

    void deleteClientByID(long id);

    void updateClient(Client client);


}

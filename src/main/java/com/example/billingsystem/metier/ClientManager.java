package com.example.billingsystem.metier;

import com.example.billingsystem.dao.entities.Client;

import java.util.List;

public interface ClientManager {

   public List<Client> Getclients();
   public Client addClient(Client client);
   public void deleteClient(Long id);

    Client updateClient( Client client);
}

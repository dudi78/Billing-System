package com.example.billingsystem.metier;

import com.example.billingsystem.dao.entities.Client;
import com.example.billingsystem.dao.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientImp  implements ClientManager{

@Autowired
ClientRepository clientRepository;


    @Override
    public List<Client> Getclients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return  clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long cid) {
        clientRepository.deleteById(cid);
    }

    @Override
    public Client updateClient( Client client) {
        if (clientRepository.existsById(client.getCustomerId())) {

            return clientRepository.save(client);
        } else {
            return null;
        }
    }
}

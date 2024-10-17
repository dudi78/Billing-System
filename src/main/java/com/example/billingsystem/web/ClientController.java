package com.example.billingsystem.web;


import com.example.billingsystem.dao.entities.Client;
import com.example.billingsystem.metier.ClientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:4200/")
public class ClientController {

    @Autowired
    ClientManager clientManager;

    @GetMapping("/getClients")
    public List<Client> getClients() {

        return clientManager.Getclients();

    }


    @PostMapping("/registerClient")
    public Client registerClient(@RequestBody Client client) {
        return clientManager.addClient(client);

    }

    @DeleteMapping("/deleteClient")
    public void deleteClient(@RequestParam Long id) {
        clientManager.deleteClient(id);
        System.out.print("deleted");
    }


    @PutMapping("/UpdateClient")
    public ResponseEntity<Client> updateClient( @RequestBody Client client) {
        Client updatedClient =  clientManager.updateClient( client);
        if (updatedClient != null) {
            return new ResponseEntity<>(updatedClient, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

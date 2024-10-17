package com.example.billingsystem;

import com.example.billingsystem.dao.entities.Client;
import com.example.billingsystem.dao.entities.Produit;
import com.example.billingsystem.dao.repositories.ClientRepository;
import com.example.billingsystem.dao.repositories.ProduitRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BillingSystemApplication {
    @Autowired
 ClientRepository clientRepository;
    @Autowired
    ProduitRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(BillingSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner start() {
        return args -> {

            Client client = new Client();
            client.setCustomerName("saidi dounia");
            client.setEmail("dunia@gmail.com");
            client.setCustomerAddress("suisse");
            client.setTel(777);

            Client client2 = new Client();
            client2.setCustomerName("Barcher Rayan");
            client2.setEmail("barcher@gmail.com");
            client2.setCustomerAddress("Korea");
            client2.setTel(888);

            Client client3 = new Client();
            client3.setCustomerName(" Laila bika");
            client3.setEmail("bika@gmail.com");
            client3.setCustomerAddress("Japan");
            client3.setTel(222);

            List<Client> Clients =new ArrayList<>();
            Clients.add(client);
            Clients.add(client2);
            Clients.add(client3);
            clientRepository.saveAll(Clients);

            Produit produit = new Produit();
            produit.setCategory("Bois d'œuvre");
            produit.setHeight(778);
            produit.setWeight(56);
            produit.setDescription("Planches de chêne de haute qualité pour construction");
            produit.setPrice(9900);
            produit.setStockQuantity(8999);
            produit.setProductName("Planches de Chêne");
            produit.setWoodType("Chêne");
            produit.setUnit("mètre");
            produit.setThickness(98);
            produit.setWidth(144);
            produit.setLength(122);

            produitRepository.save(produit);


        };
    }

}

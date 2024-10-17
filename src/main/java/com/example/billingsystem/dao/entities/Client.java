package com.example.billingsystem.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String email;
    private Integer Tel;
    private String customerAddress;


    @OneToMany(mappedBy = "client")
    private List<Commande> Commandes;

}

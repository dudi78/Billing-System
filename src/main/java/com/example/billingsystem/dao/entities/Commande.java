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
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cmdId;
    private String cmdDescription;

    @ManyToMany
    List<Produit> produits;
    @ManyToOne
    private Client client;
}

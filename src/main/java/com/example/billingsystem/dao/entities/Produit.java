package com.example.billingsystem.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String productName;
    private String description;
    private double length;
    private double width;
    private double height;
    private double thickness;
    private String woodType;
    private double price;
    private String unit;
    private int stockQuantity;
    private double weight;


    @ManyToMany(mappedBy = "produits")
    List<Commande> commandes = new ArrayList<>();
}

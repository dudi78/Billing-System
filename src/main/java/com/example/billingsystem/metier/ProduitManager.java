package com.example.billingsystem.metier;

import com.example.billingsystem.dao.entities.Produit;

import java.util.List;

public interface ProduitManager {

    public List<Produit> GetProduits();
    public Produit UpdateProduct(Produit produit);
    public Produit AddProduct(Produit produit);
    public void deleteProduct(Long id);
}

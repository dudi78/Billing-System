package com.example.billingsystem.metier;

import com.example.billingsystem.dao.entities.Produit;
import com.example.billingsystem.dao.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitImp implements ProduitManager{
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public List<Produit> GetProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit UpdateProduct(Produit produit) {

        return produitRepository.save(produit);
    }

    @Override
    public Produit AddProduct(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deleteProduct(Long id) {
        produitRepository.deleteById(id);
    }
}

package com.example.billingsystem.web;

import com.example.billingsystem.dao.entities.Client;
import com.example.billingsystem.dao.entities.Produit;
import com.example.billingsystem.metier.ProduitManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class ProduitController {

    @Autowired
    ProduitManager produitManager;

    @GetMapping("/getProducts")
    public List<Produit> getProducts(){
        return produitManager.GetProduits();
    }


    @PutMapping("/UpdateProduct")
    public Produit updateClient(@RequestBody Produit produit) {
       return   produitManager.UpdateProduct( produit);

    }
    @PostMapping("/addProduct")
    public Produit registerProduct(@RequestBody Produit produit) {
        return produitManager.AddProduct(produit);

    }


    @DeleteMapping("/deleteproduct")
    public void deleteClient(@RequestParam Long id) {
        produitManager.deleteProduct(id);
        System.out.print("deleted");
    }
}

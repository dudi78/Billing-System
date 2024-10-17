package com.example.billingsystem.dao.repositories;

import com.example.billingsystem.dao.entities.Client;
import com.example.billingsystem.dao.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}

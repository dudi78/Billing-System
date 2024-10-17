package com.example.billingsystem.dao.repositories;

import com.example.billingsystem.dao.entities.Client;
import com.example.billingsystem.dao.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}

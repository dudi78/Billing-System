package com.example.billingsystem.dao.repositories;

import com.example.billingsystem.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

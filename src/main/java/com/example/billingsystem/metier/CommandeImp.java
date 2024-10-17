package com.example.billingsystem.metier;

import com.example.billingsystem.dao.repositories.CommandeRepository;
import com.example.billingsystem.dao.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeImp {
    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private ProduitRepository produitRepository;


}

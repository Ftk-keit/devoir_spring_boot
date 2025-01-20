package com.devoir.devoir_spring_boot.services;

import com.devoir.devoir_spring_boot.data.entities.Commande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CommandeService {
    Commande findById(Long id);
    Commande save(Commande commande);
    Page<Commande> findCommandesByClientId(Long clientId, Pageable pageable);
}

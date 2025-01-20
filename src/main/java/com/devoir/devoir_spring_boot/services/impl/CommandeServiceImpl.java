package com.devoir.devoir_spring_boot.services.impl;

import com.devoir.devoir_spring_boot.data.entities.Commande;
import com.devoir.devoir_spring_boot.data.repository.CommandeRepository;
import com.devoir.devoir_spring_boot.services.CommandeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CommandeServiceImpl implements CommandeService {
    private final CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande findById(Long id) {
      return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public Commande save(Commande commande) {
       return commandeRepository.save(commande);
    }

    @Override
    public Page<Commande> findCommandesByClientId(Long clientId, Pageable pageable) {
        return commandeRepository.findByClientId(clientId, pageable);
    }
}

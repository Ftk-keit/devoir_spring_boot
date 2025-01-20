package com.devoir.devoir_spring_boot.web.controllers.impl;

import com.devoir.devoir_spring_boot.data.entities.Commande;
import com.devoir.devoir_spring_boot.services.CommandeService;
import com.devoir.devoir_spring_boot.web.controllers.CommandeController;
import com.devoir.devoir_spring_boot.web.dto.response.Response;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandeControllerImpl implements CommandeController {
    private final CommandeService commandeService;

    public CommandeControllerImpl(CommandeService commandeService) {
        this.commandeService = commandeService;
    }


    @Override
    public ResponseEntity<Response> getCommandesByClientId(Long id, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Commande> commandes = commandeService.findCommandesByClientId(id, pageable);
        return  new ResponseEntity<>(new Response("200", "Commandes", commandes), HttpStatus.OK);
    }
}

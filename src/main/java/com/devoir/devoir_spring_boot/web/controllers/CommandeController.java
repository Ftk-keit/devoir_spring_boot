package com.devoir.devoir_spring_boot.web.controllers;

import com.devoir.devoir_spring_boot.web.dto.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@RequestMapping("commandes")
public interface CommandeController {

    @GetMapping("/{id}/commandes")
    ResponseEntity<Response> getCommandesByClientId(@PathVariable Long id, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size);
}

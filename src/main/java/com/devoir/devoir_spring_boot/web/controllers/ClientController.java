package com.devoir.devoir_spring_boot.web.controllers;

import com.devoir.devoir_spring_boot.data.entities.Client;
import com.devoir.devoir_spring_boot.web.dto.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("clients")
public interface ClientController
{
    @PostMapping("/commandes")
    ResponseEntity<Response> createClientWithCommandes(@Valid @RequestBody Client client );




}

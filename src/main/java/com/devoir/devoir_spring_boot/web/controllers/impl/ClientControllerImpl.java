package com.devoir.devoir_spring_boot.web.controllers.impl;

import com.devoir.devoir_spring_boot.data.entities.Client;
import com.devoir.devoir_spring_boot.services.ClientService;
import com.devoir.devoir_spring_boot.web.controllers.ClientController;
import com.devoir.devoir_spring_boot.web.dto.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientControllerImpl implements ClientController {
    private final ClientService clientService;

    public ClientControllerImpl(ClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    public ResponseEntity<Response> createClientWithCommandes(@Valid @RequestBody  Client client) {
        Client client1 = clientService.save(client);
        //regle pour valider.......
        return new ResponseEntity<>(new Response("201", "Clients", client1), HttpStatus.CREATED) ;
    }
}

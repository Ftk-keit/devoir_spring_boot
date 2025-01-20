package com.devoir.devoir_spring_boot.services.impl;

import com.devoir.devoir_spring_boot.data.entities.Client;
import com.devoir.devoir_spring_boot.data.repository.ClientRepository;
import com.devoir.devoir_spring_boot.services.ClientService;

public class ClientServiceImpl  implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client save(Client client) {
       return clientRepository.save(client);
    }
}

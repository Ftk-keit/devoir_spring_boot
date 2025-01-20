package com.devoir.devoir_spring_boot.services;

import com.devoir.devoir_spring_boot.data.entities.Client;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {
    Client findById(Long clientId);
    Client save(Client client);
}

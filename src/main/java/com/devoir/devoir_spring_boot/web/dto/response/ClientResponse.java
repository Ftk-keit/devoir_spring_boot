package com.devoir.devoir_spring_boot.web.dto.response;

import com.devoir.devoir_spring_boot.data.entities.Client;
import com.devoir.devoir_spring_boot.data.entities.Commande;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class ClientResponse {

    private Long id;


    private String name;


    private String telephone;

    public ClientResponse(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.telephone = client.getTelephone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

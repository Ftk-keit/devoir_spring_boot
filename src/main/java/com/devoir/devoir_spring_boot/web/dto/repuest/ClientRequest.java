package com.devoir.devoir_spring_boot.web.dto.repuest;

import com.devoir.devoir_spring_boot.data.entities.Client;
import com.devoir.devoir_spring_boot.data.entities.Commande;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;

import java.util.HashSet;
import java.util.Set;

public class ClientRequest {
    private Long id;

    @NotNull
    private String name;

    @Column(length = 25)
    @NotNull(message = "Le numéro de téléphone ne doit pas être null")
    @NotBlank(message = "Le numéro de téléphone ne doit pas être vide")
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Numéro de téléphone invalide")
    @Column(unique = true, nullable = false)
    private String telephone;

    public Client ToEntity(Client data) {
        Client entity = new Client();
        entity.setName(data.getName());
        entity.setTelephone(data.getTelephone());

    return entity;
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
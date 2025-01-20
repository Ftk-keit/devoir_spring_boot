package com.devoir.devoir_spring_boot.web.dto.response;

import com.devoir.devoir_spring_boot.data.entities.Client;
import com.devoir.devoir_spring_boot.data.entities.Commande;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class CommandeResponse {
    private Long id;

    private LocalDate date;

    private int montant;

    private String clientName;

    public CommandeResponse(Commande commande) {
       this.id = commande.getId();
       this.date = commande.getDate();
       this.montant = commande.getMontant();
       this.clientName = commande.getClient().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}

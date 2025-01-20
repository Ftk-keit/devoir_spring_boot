package com.devoir.devoir_spring_boot.data.entities;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.*;



import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    @NotNull
    private String name;

    @Column(length = 25)
    @NotNull(message = "Le numéro de téléphone ne doit pas être null")
    @NotBlank(message = "Le numéro de téléphone ne doit pas être vide")
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Numéro de téléphone invalide")
    @Column(unique = true, nullable = false)
    private String telephone;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private Set<Commande> commandes = new HashSet<>();
}

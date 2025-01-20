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
    private String name;

    @Column(unique = true, nullable = false)
    private String telephone;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private Set<Commande> commandes = new HashSet<>();
}

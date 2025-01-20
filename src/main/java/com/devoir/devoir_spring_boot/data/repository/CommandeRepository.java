package com.devoir.devoir_spring_boot.data.repository;

import com.devoir.devoir_spring_boot.data.entities.Commande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    Page<Commande> findByClientId(Long clientId, Pageable pageable);
}

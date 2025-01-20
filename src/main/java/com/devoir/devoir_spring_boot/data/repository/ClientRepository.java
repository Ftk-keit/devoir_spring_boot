package com.devoir.devoir_spring_boot.data.repository;

import com.devoir.devoir_spring_boot.data.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

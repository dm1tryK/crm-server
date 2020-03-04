package com.crm.server.repository;

import com.crm.server.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByFirstName(String name);
}
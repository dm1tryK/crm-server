package com.crm.server.controller;

import com.crm.server.entity.Client;
import com.crm.server.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class GetInfoController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(path = "/insert")
    @Transactional
    public void insertClient() {
        clientRepository.save(new Client());
    }

    @GetMapping(path = "/get")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}

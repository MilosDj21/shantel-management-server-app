package com.example.main.controllers;

import com.example.main.models.ClientModel;
import com.example.main.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<ClientModel> findAll(){
        return clientService.findAll();
    }

    @PostMapping("/users/{userId}/clients")
    public ClientModel saveOne(@PathVariable long userId, @RequestBody ClientModel client){

        return clientService.saveOne(client);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteOne(@PathVariable long id){
        clientService.deleteOne(id);
    }
}

package com.example.main.controllers;

import com.example.main.models.ClientModel;
import com.example.main.models.LinkModel;
import com.example.main.services.ClientService;
import com.example.main.services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
public class LinkController {
    @Autowired
    private LinkService linkService;
    @Autowired
    private ClientService clientService;

    @GetMapping("/links")
    public List<LinkModel> findAll(){
        return linkService.findAll();
    }

    @GetMapping("/clients/{clientId}/links")
    public List<LinkModel> findAllByClientId(@PathVariable long clientId){
        return linkService.findAllByClientId(clientId);
    }

    @PostMapping("/clients/{clientId}/links")
    public LinkModel saveOne(@PathVariable long clientId, @RequestBody LinkModel linkModel){
        ClientModel c = clientService.findById(clientId);
        if(c == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }else {
            linkModel.setKlijent(c);
            return linkService.saveOne(linkModel);
        }
    }

    @DeleteMapping("/links/{id}")
    public void deleteOne(@PathVariable long id){
        linkService.deleteById(id);
    }
}

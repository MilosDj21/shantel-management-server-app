package com.example.main.controllers;

import com.example.main.models.LinkModel;
import com.example.main.services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class LinkController {
    @Autowired
    private LinkService linkService;

    @GetMapping("/links")
    public List<LinkModel> findAll(){
        return linkService.findAll();
    }

    @PostMapping("/links")
    public LinkModel saveOne(@RequestBody LinkModel link){
        return linkService.saveOne(link);
    }

    @DeleteMapping("/links/{id}")
    public void deleteOne(@PathVariable long id){
        linkService.deleteOne(id);
    }
}

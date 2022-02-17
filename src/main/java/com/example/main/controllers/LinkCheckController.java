package com.example.main.controllers;

import com.example.main.models.ClientModel;
import com.example.main.models.LinkCheckModel;
import com.example.main.models.RequestModel;
import com.example.main.services.LinkCheckService;
import com.example.main.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
public class LinkCheckController {
    @Autowired
    private LinkCheckService linkCheckService;
    @Autowired
    private RequestService requestService;

    @GetMapping("/linkcheck")
    public List<LinkCheckModel> findAll(){
        return linkCheckService.findAll();
    }

    @GetMapping("/requests/{requestId}/linkcheck")
    public List<LinkCheckModel> findAllByRequestId(@PathVariable long requestId){
        return linkCheckService.findAllByRequestId(requestId);
    }

    @PostMapping("/requests/{requestId}/linkcheck")
    public LinkCheckModel saveOne(@PathVariable long requestId, @RequestBody LinkCheckModel linkCheckModel){
        RequestModel r = requestService.findById(requestId);
        if(r == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }else {
            linkCheckModel.setZahtev(r);
            return linkCheckService.saveOne(linkCheckModel);
        }
    }

    @DeleteMapping("/linkcheck/{id}")
    public void deleteOne(@PathVariable long id){
        linkCheckService.deleteById(id);
    }
}

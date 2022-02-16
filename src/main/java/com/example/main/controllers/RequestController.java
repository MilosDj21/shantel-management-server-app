package com.example.main.controllers;

import com.example.main.models.RequestModel;
import com.example.main.models.UserModel;
import com.example.main.services.RequestService;
import com.example.main.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
public class RequestController {

    @Autowired
    private RequestService requestService;
    @Autowired
    private UserService userService;

    @GetMapping("/requests")
    public List<RequestModel> findAll(){
        return requestService.findAll();
    }

    @PostMapping("/users/{userId}/requests")
    public RequestModel saveOne(@PathVariable Long userId, @RequestBody RequestModel requestModel){
        UserModel u = userService.findById(userId);
        if(u == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }else {
            requestModel.setKorisnik(u);
            return requestService.saveOne(requestModel);
        }
    }

    @DeleteMapping("/requests/{id}")
    public void deleteOne(@PathVariable long id){
        requestService.deleteOne(id);
    }
}

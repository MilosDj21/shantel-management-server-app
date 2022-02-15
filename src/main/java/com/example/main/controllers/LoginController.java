package com.example.main.controllers;

import com.example.main.ShantelKlijentiServerApplication;
import com.example.main.models.SessionModel;
import com.example.main.models.UserModel;
import com.example.main.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    /*@GetMapping("/login")
    public UserModel login(@RequestBody UserModel user){
        return userService.getOne(user);
    }*/
}

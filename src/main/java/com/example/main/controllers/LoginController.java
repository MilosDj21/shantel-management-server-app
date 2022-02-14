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

    @GetMapping("/login")
    public SessionModel login(@RequestBody UserModel user){
        List<UserModel> users = userService.findAll();
        for(UserModel u: users){
            if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())){
                SessionModel session = new SessionModel(u);
                ShantelKlijentiServerApplication.SESSION_LIST.add(session);
                return session;
            }
        }
        return null;
    }
}

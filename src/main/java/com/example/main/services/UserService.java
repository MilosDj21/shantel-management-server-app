package com.example.main.services;

import com.example.main.models.UserModel;
import com.example.main.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> findAll(){
        return userRepository.findAll();
    }

    public UserModel saveOne(UserModel user){
        return userRepository.save(user);
    }

    public void deleteOne(int id){
        userRepository.deleteById(id);
    }

}

package com.example.main.services;

import com.example.main.models.ClientModel;
import com.example.main.models.RequestModel;
import com.example.main.models.UserModel;
import com.example.main.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private UserService userService;

    public List<ClientModel> findAll(){
        return clientRepository.findAll();
    }

    public ClientModel findById(long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public List<ClientModel> findAllByUserId(long userId){
        List<ClientModel> list = new ArrayList<>();
        UserModel u = userService.findById(userId);
        List<ClientModel> list1 = findAll();
        for(ClientModel c: list1){
            if(c.getKorisnik().equals(u)){
                list.add(c);
            }
        }
        return list;
    }

    public ClientModel saveOne(ClientModel model){
        return clientRepository.save(model);
    }

    public void deleteById(long id){
        clientRepository.deleteById(id);
    }



}

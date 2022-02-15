package com.example.main.services;

import com.example.main.models.ClientModel;
import com.example.main.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<ClientModel> findAll(){
        return clientRepository.findAll();
    }

    public ClientModel saveOne(ClientModel model){
        return clientRepository.save(model);
    }

    public void deleteOne(long id){
        clientRepository.deleteById(id);
    }



}

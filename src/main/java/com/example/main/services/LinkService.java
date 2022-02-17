package com.example.main.services;

import com.example.main.models.ClientModel;
import com.example.main.models.LinkModel;
import com.example.main.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkService {
    @Autowired
    private LinkRepository linkRepository;
    @Autowired
    private ClientService clientService;


    public List<LinkModel> findAll(){
        return linkRepository.findAll();
    }

    public List<LinkModel> findAllByClientId(long clientId){
        List<LinkModel> list = new ArrayList<>();
        ClientModel c = clientService.findById(clientId);
        List<LinkModel> list1 = findAll();
        for(LinkModel l: list1){
            if(l.getKlijent().equals(c)){
                list.add(l);
            }
        }
        return list;
    }

    public LinkModel saveOne(LinkModel link){
        return linkRepository.save(link);
    }

    public void deleteById(long id){
        linkRepository.deleteById(id);
    }
}

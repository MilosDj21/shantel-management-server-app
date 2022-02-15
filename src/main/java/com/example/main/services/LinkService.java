package com.example.main.services;

import com.example.main.models.LinkModel;
import com.example.main.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkService {
    @Autowired
    private LinkRepository linkRepository;

    public List<LinkModel> findAll(){
        return linkRepository.findAll();
    }

    public LinkModel saveOne(LinkModel link){
        return linkRepository.save(link);
    }

    public void deleteOne(long id){
        linkRepository.deleteById(id);
    }
}

package com.example.main.services;

import com.example.main.models.RequestModel;
import com.example.main.models.LinkCheckModel;
import com.example.main.repositories.LinkCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkCheckService {
    @Autowired
    private LinkCheckRepository linkCheckRepository;
    @Autowired
    private RequestService requestService;


    public List<LinkCheckModel> findAll(){
        return linkCheckRepository.findAll();
    }

    public List<LinkCheckModel> findAllByRequestId(long requestId){
        List<LinkCheckModel> list = new ArrayList<>();
        RequestModel r = requestService.findById(requestId);
        List<LinkCheckModel> list1 = findAll();
        for(LinkCheckModel l: list1){
            if(l.getZahtev().equals(r)){
                list.add(l);
            }
        }
        return list;
    }

    public LinkCheckModel saveOne(LinkCheckModel link){
        return linkCheckRepository.save(link);
    }

    public void deleteById(long id){
        linkCheckRepository.deleteById(id);
    }
}

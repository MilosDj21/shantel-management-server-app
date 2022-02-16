package com.example.main.services;

import com.example.main.models.RequestModel;
import com.example.main.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<RequestModel> findAll(){
        return requestRepository.findAll();
    }

    public RequestModel saveOne(RequestModel requestModel){
        return requestRepository.save(requestModel);
    }

    public void deleteOne(long id){
        requestRepository.deleteById(id);
    }


}

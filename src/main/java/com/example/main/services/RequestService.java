package com.example.main.services;

import com.example.main.models.RequestModel;
import com.example.main.models.UserModel;
import com.example.main.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;
    @Autowired
    private UserService userService;

    public List<RequestModel> findAll(){
        return requestRepository.findAll();
    }

    public RequestModel findById(long id){
        return requestRepository.findById(id).orElse(null);
    }

    public List<RequestModel> findAllByUserId(long userId){
        List<RequestModel> list = new ArrayList<>();
        UserModel u = userService.findById(userId);
        List<RequestModel> list1 = findAll();
        for(RequestModel r: list1){
            if(r.getKorisnik().equals(u)){
                list.add(r);
            }
        }
        return list;
    }

    public RequestModel saveOne(RequestModel requestModel){
        return requestRepository.save(requestModel);
    }

    public void deleteById(long id){
        requestRepository.deleteById(id);
    }


}

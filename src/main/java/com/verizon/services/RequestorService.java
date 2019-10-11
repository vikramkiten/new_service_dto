package com.verizon.services;


import com.verizon.entities.Requestor;
import com.verizon.repositories.RequestorJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RequestorService {

    @Autowired
    public RequestorJpaRepository requestorJpaRepository;


    public String saveRequestorInfo(Requestor requestor)
    {
        Optional<Requestor> reponse=requestorJpaRepository.findById(requestor.getId());
         if(reponse.isPresent())
             return  "Requestor Info already exists!";
         requestorJpaRepository.save(requestor);
         return  "Requestor Info saved successfully!";


    }
}

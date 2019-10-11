package com.verizon.controller;

import com.verizon.NewServiceEquipmentDTO;
import com.verizon.entities.Requestor;
import com.verizon.services.RequestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/equipment")
public class MainController {

    @Autowired
    private RequestorService requestorService;




    @PostMapping("/saveform")
    public ResponseEntity<String> addFormRequestor(@RequestBody NewServiceEquipmentDTO newServiceEquipmentDTO)
    {
       String response= requestorService.saveRequestorInfo(newServiceEquipmentDTO);
       return new ResponseEntity<String>(response,HttpStatus.OK);

    }



}

package com.dbs.dbsdemo.controller;

import com.dbs.dbsdemo.modal.Employe;
import com.dbs.dbsdemo.modal.LoginUser;
import com.dbs.dbsdemo.service.InterServiceCommunication;
import com.dbs.dbsdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    LoginService service;

    @PostMapping("v1/login")
    public ResponseEntity validateUser(@RequestBody LoginUser loginUser){
         if(service.validateUser(loginUser)){
           return ResponseEntity.ok(" User Login Successfully");

         }else
             return  ResponseEntity.ok("Not Valid User ");

    }

}

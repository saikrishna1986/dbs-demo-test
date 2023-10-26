package com.dbs.dbsdemo.controller;

import com.dbs.dbsdemo.modal.Employe;
import com.dbs.dbsdemo.service.InterServiceCommunication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employe")
public class EmployeConroller {

    @Autowired
    InterServiceCommunication interServiceCommunication;

    @GetMapping("v1/getEmployee")
    public Employe getEmploye(@RequestParam Integer id){
        return  interServiceCommunication.getEmployee(id);
    }
}

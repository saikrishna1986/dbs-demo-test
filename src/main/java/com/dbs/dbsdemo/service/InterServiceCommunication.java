package com.dbs.dbsdemo.service;

import com.dbs.dbsdemo.modal.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class InterServiceCommunication {

    @Autowired
    RestTemplate template;
    String URI = "http://localhost:9090/employe/v1/findEmployee?id=";

    public Employe getEmployee(int id) {
        Employe employee=null;
        ResponseEntity<Employe> employe=null;
        try {
            employe = template.getForEntity(URI + id, Employe.class);
         }catch (Exception exception){
            exception.printStackTrace();
         }

        if (employe.hasBody()) {
            employee = employe.getBody();
        } else employee =new Employe();

        return employee;
    }


}

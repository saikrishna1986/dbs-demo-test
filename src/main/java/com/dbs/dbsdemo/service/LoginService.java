package com.dbs.dbsdemo.service;

import com.dbs.dbsdemo.entity.User;
import com.dbs.dbsdemo.modal.LoginUser;
import com.dbs.dbsdemo.repository.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    @Autowired
    LoginUserRepository repository;

    public boolean validateUser(LoginUser user){
        User userInfo = repository.findByNameAndPassword(user.getName(), user.getPassword());
        if(user==null){
            return false;
        }

        if(user.getName().equals(userInfo.getName()) && user.getPassword().equals(userInfo.getPassword())) {
            return true;
        } else return false;
    }
}

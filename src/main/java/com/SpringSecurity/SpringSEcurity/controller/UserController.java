package com.SpringSecurity.SpringSEcurity.controller;

import com.SpringSecurity.SpringSEcurity.model.User;
import com.SpringSecurity.SpringSEcurity.service.UserserviceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserserviceController usercontroller;

    @PostMapping ("register")
    public User register(@RequestBody User user){
        return usercontroller.registeruser(user);
    }
}

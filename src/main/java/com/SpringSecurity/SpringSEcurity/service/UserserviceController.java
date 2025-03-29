package com.SpringSecurity.SpringSEcurity.service;

import com.SpringSecurity.SpringSEcurity.dao.UserRepo;
import com.SpringSecurity.SpringSEcurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserserviceController {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User registeruser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user) ;
    }
}

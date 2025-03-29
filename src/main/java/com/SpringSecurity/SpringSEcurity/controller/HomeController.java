package com.SpringSecurity.SpringSEcurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String greet(HttpServletRequest session){
        return "hello World"+ session.getSession().getId();
    }

    @GetMapping("/prithwish")
    public String heat(HttpServletRequest session){
        return "Prithwish" + session.getSession().getId() ;
    }

}

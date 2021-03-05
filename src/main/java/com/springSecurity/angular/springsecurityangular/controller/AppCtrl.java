package com.springSecurity.angular.springsecurityangular.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class AppCtrl {

    @GetMapping("/getmsg")
    public String greetings(){
        return "<h1>WelCome to Spring Security...</h1>";
    }
}

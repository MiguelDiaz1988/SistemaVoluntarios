package com.voluntario.voluntariadoagenda.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/")
    public String getSomething() {
        return "Hello world";
    }
}

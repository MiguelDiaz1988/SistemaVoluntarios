package com.voluntario.voluntariadoagenda.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @RequestMapping("/")
    public String login(HttpSession session) {
        // TODO: Validar usuario y password a traves de basis auth
        session.setAttribute("usuario", "usuario_logueado");
        return "redirect:/";
    }
}

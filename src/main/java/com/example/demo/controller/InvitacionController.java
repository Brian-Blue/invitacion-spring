package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvitacionController {

    @GetMapping("/invitacion")
    public String mostrarInvitacion() {
        return "invitacion"; // busca invitacion.html en templates
    }
}
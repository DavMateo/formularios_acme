package com.acme.encuestas.encuesta.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormsController {
    
    @GetMapping("/encuesta")
    public String encuestaView() {
        return "encuesta";
    }
}

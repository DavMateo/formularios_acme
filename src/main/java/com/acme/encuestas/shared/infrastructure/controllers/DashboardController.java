package com.acme.encuestas.shared.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    
    @GetMapping("/dashboard")
    public String panelPrincipal() {
        return "dashboard";
    }
}

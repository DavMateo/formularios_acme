package com.acme.encuestas.shared.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testPageController {
    
    @GetMapping("/test")
    public String testPage() {
        return "testViews";
    }
}
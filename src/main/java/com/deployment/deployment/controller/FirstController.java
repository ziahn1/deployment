package com.deployment.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    
    @GetMapping("/result")
    public String getResult(){
        return "This is Result";
    }
}

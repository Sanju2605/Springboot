package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {

    
    private String studentName = "IamNeo";
    @GetMapping("disp")
    public String getName() {
        return "Welcome " + studentName + "!";
    }
}

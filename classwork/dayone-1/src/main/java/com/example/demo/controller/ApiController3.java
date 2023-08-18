package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {

    private String yourFavColor = "Green"; 
    @GetMapping("noo")
    public String getMyFav() {
        return "My favorite color is " + yourFavColor;
    }
}
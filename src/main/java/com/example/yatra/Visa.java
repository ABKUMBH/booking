package com.example.yatra;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Visa {
    @GetMapping("/visa")
    public String getData() {
        return "Visa daal na bro";
    }
}
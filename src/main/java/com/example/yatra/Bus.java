package com.example.yatra;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Bus {
    @GetMapping("/mybus")
    public String getData(){
        return "No Bus Available bro, us another option";
    }
}

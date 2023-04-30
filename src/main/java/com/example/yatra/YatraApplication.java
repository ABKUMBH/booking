package com.example.yatra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
@RestController
public class YatraApplication {
    @GetMapping("/yatra")
	public static void main(String[] args) {
		SpringApplication.run(YatraApplication.class, args);
	}

}

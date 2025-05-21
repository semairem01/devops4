package com.example.project4.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "Hello from Kubernates Cluster!";
    }
}

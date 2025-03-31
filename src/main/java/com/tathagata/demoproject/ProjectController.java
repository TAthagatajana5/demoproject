package com.tathagata.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

}

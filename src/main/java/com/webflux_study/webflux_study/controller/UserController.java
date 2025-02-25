package com.webflux_study.webflux_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String getHello(){
        // mono
        return "hello";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye";
    }
}
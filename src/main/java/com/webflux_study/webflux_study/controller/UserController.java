package com.webflux_study.webflux_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @GetMapping("/")
    public Mono<String> getHello(){
        return Mono.just("Hello World");
    }

    @GetMapping("/bye/{name}")
    public Mono<String> getBye(@PathVariable("name") String name){
        return Mono.just("bye" + name);
    }
}
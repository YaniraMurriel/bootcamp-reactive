package com.bootcamp.example.asincrono.web.controller;

import com.bootcamp.example.asincrono.domain.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("hello")
    Mono<String> hello() {
        return this.greetingService.hello();
    }

    @GetMapping("hello2")
    Mono<String> hello2() {
        return this.greetingService.hello2();
    }

//    @RequestMapping("hellos")
//    public Flux<String> hellos() {
//
//        Mono<String> mono1 = this.greetingService.hello();
//        Mono<String> mono2 = this.greetingService.hello2();
//
//        Flux<String> flow = Flux.merge(mono1, mono2);
//
//        return flow;
//    }

}

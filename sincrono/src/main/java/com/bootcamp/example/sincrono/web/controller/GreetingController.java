package com.bootcamp.example.sincrono.web.controller;

import com.bootcamp.example.sincrono.domain.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("hello")
    String hello1(){
        return this.greetingService.hello();
    }

    @GetMapping("hello2")
    String hello2(){
        return this.greetingService.hello2();
    }

//    @GetMapping("hellos")
//    String hellos(){
//        return this.greetingService.hello() + ' ' + this.greetingService.hello2();
//    }

}

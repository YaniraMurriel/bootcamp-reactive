package com.bootcamp.example.asincrono.domain.service.impl;

import com.bootcamp.example.asincrono.domain.service.GreetingService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public Mono<String> hello() {
        return Mono.just("hola asincrono").delayElement(Duration.ofSeconds(3));
    }

    @Override
    public Mono<String> hello2() {
        return Mono.just("hola asincrono 2").delayElement(Duration.ofSeconds(3));
    }
}

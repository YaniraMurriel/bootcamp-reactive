package com.bootcamp.example.asincrono.domain.service;

import reactor.core.publisher.Mono;

public interface GreetingService {
    Mono<String> hello();
    Mono<String> hello2();
}

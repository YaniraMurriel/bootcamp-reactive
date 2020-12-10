package com.bootcamp.example.sincrono.domain.service.impl;

import com.bootcamp.example.sincrono.domain.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String hello() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "hola sincrono 1";
    }

    @Override
    public String hello2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "hola sincrono 2";
    }
}

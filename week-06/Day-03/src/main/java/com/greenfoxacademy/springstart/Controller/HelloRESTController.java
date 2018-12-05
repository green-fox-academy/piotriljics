package com.greenfoxacademy.springstart.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTController {
    AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greetingNew(@RequestParam String name){
        return new Greeting(counter.getAndIncrement(), "Hello " + name );
    }
}

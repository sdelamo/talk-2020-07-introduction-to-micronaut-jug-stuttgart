package org.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

// /greet/sergio
@Controller("/greet")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Get("/{name}")
    public Greeting greet(String name) {
        return greetingService.greet(name);
    }

}

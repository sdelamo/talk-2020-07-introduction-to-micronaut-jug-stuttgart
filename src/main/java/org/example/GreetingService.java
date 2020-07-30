package org.example;

import javax.validation.constraints.Pattern;

public interface GreetingService {

    Greeting greet(String name);
}

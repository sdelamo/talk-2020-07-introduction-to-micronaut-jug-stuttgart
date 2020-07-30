package org.example;

import javax.inject.Singleton;

@Singleton
public class GreetingServiceImpl implements GreetingService {

    private final GreettingConfiguration greettingConfiguration;

    public GreetingServiceImpl(GreettingConfiguration greettingConfiguration) {
        this.greettingConfiguration = greettingConfiguration;
    }

    @Override
    public Greeting greet(String name) {
        Greeting greeting = new Greeting();
        greeting.setMessage(greettingConfiguration.getPrefix() + " " + name);
        return greeting;
    }
}

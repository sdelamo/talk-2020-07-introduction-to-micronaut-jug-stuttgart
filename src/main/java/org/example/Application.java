package org.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(version = "0.1", title = "jug"))
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}

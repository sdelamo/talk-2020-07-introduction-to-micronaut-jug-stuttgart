package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("greeting")
public class GreettingConfiguration {
    private String prefix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}

package org.example

import io.micronaut.http.HttpRequest
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class GreetingClientSpec extends Specification {

    @Inject
    GreetingClient client

    void "I can use a Micronaut declarative HTTP Client to contact /greet/sergio"() {
        when:
        Greeting response = client.fetchGreeting("sergio").blockingGet()

        then:
        "Hello sergio" == response.message

    }
}

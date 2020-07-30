package org.example

import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.Specification

class GreetingControllerSpec extends Specification {

    void "test /greet/sergio returns Hello Sergio"() {
        given:
        EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)
        HttpClient httpClient = embeddedServer.applicationContext.createBean(HttpClient, embeddedServer.URL)

        when:
        Greeting response = httpClient.toBlocking().retrieve(HttpRequest.GET("/greet/sergio"), Greeting)

        then:
        "Hello sergio" == response.message

        cleanup:
        embeddedServer.close()

    }
}

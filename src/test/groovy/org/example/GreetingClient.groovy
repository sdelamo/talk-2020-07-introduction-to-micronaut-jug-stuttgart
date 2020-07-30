package org.example

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

@Client("/greet")
interface GreetingClient {

    @Get("/{name}")
    Single<Greeting> fetchGreeting(String name)
}
package com.brisson.routes

import com.brisson.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.18.4:8080"
private val rabbits = listOf(
    Rabbit("Logan","It may looks cute, but it can chop concrete", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Douglas","It might look cute, and actually is", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Joe","Joe is nice rabbit, but smokes a lot of weed", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Robin","Robin is kinda nervous today, you better not bother him", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Jane","Jane is pissed of with society cause she's the only female", "$BASE_URL/rabbits/rabbit5.jpg")
)

fun Route.randomRabbit() {
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}
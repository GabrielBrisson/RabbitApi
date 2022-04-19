package com.brisson.plugins

import com.brisson.routes.randomRabbit
import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    routing {
        get("/"){
            call.respond("Hello there!")
        }
        randomRabbit()
        // Static plugin. Try to access `/static/index.html`
        static{
            resources("static")
        }
    }
}

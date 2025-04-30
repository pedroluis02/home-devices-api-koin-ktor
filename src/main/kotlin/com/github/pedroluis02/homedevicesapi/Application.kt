package com.github.pedroluis02.homedevicesapi

import com.github.pedroluis02.homedevicesapi.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureDependencyInjection()
    configureRouting()
}

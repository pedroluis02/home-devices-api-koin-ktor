package com.github.pedroluis02.homedevicesapi.routing

import com.github.pedroluis02.homedevicesapi.domain.Device
import com.github.pedroluis02.homedevicesapi.domain.DeviceService
import com.github.pedroluis02.homedevicesapi.domain.User
import com.github.pedroluis02.homedevicesapi.domain.UserService
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.userRoute() {
    val service by application.inject<UserService>()
    val deviceService by application.inject<DeviceService>()

    get {
        val users = service.getAll()
        call.respond(users.map(User::toDto))
    }

    get("/{id}") {
        val id = call.parameters["id"]?.toLong()
            ?: return@get call.respond(HttpStatusCode.BadRequest)

        val found = service.getById(id)
            ?: return@get call.respond(HttpStatusCode.NotFound)

        call.respond(found.toDto())
    }

    get("/{id}/devices") {
        val id = call.parameters["id"]?.toLong()
            ?: return@get call.respond(HttpStatusCode.BadRequest)

        val devices = deviceService.findAllByUserId(id)
        call.respond(devices.map(Device::toDto))
    }
}

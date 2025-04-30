package com.github.pedroluis02.homedevicesapi

import com.github.pedroluis02.homedevicesapi.domain.User
import com.github.pedroluis02.homedevicesapi.domain.UserService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val service by inject<UserService>()

    routing {
        get("/health") {
            call.respond(HttpStatusCode.OK)
        }

        route("/users") {
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
        }
    }
}

@Serializable
data class UserDto(
    val id: Long,
    val name: String
)

private fun User.toDto() = UserDto(id, name)

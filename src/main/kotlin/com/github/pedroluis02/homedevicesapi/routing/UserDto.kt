package com.github.pedroluis02.homedevicesapi.routing

import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val id: Long,
    val name: String
)

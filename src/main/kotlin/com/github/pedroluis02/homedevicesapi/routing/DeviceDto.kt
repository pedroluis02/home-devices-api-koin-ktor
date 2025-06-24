package com.github.pedroluis02.homedevicesapi.routing

import kotlinx.serialization.Serializable

@Serializable
class DeviceDto(
    val id: String,
    val name: String,
    val type: String,
    val status: Boolean,
    val createdAt: Long,
    val userId: Long? = null
)
package com.github.pedroluis02.homedevicesapi.domain

import java.util.*

data class Device(
    val id: String? = null,
    val name: String,
    val type: String,
    val status: Boolean = true,
    val createdAt: Date? = null,
    val userId: Long? = null
)

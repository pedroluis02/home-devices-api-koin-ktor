package com.github.pedroluis02.homedevicesapi.routing

import com.github.pedroluis02.homedevicesapi.domain.Device
import com.github.pedroluis02.homedevicesapi.domain.User

fun User.toDto() = UserDto(id, name)

fun Device.toDto() = DeviceDto(id!!, name, type, status, createdAt!!.time, userId)

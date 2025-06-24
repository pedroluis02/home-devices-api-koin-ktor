package com.github.pedroluis02.homedevicesapi.domain

fun interface DeviceService {
    fun findAllByUserId(userId: Long): List<Device>
}

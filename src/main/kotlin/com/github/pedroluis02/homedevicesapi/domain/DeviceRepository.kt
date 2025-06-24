package com.github.pedroluis02.homedevicesapi.domain

fun interface DeviceRepository {
    fun findAllByUserId(userId: Long): List<Device>
}

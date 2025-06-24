package com.github.pedroluis02.homedevicesapi.repository

import com.github.pedroluis02.homedevicesapi.domain.Device
import com.github.pedroluis02.homedevicesapi.domain.DeviceRepository
import org.koin.core.annotation.Single
import java.util.*

@Single
class DeviceRepositoryImpl : DeviceRepository {
    private val devices = listOf(
        Device(
            id = UUID.randomUUID().toString(),
            name = "work-android-device",
            type = "mobile",
            createdAt = Date(),
            userId = 1
        ),
        Device(
            id = UUID.randomUUID().toString(),
            name = "desktop-samsung-device",
            type = "desktop",
            createdAt = Date(),
            userId = 1
        )
    )

    override fun findAllByUserId(userId: Long): List<Device> {
        return devices.filter { it.userId == userId }
    }
}

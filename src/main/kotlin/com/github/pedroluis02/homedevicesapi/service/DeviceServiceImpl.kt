package com.github.pedroluis02.homedevicesapi.service

import com.github.pedroluis02.homedevicesapi.domain.Device
import com.github.pedroluis02.homedevicesapi.domain.DeviceRepository
import com.github.pedroluis02.homedevicesapi.domain.DeviceService

class DeviceServiceImpl(private val repository: DeviceRepository) : DeviceService {
    override fun findAllByUserId(userId: Long): List<Device> {
        return repository.findAllByUserId(userId)
    }
}

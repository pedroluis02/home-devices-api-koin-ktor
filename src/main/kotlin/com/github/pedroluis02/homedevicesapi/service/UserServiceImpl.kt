package com.github.pedroluis02.homedevicesapi.service

import com.github.pedroluis02.homedevicesapi.domain.User
import com.github.pedroluis02.homedevicesapi.domain.UserRepository
import com.github.pedroluis02.homedevicesapi.domain.UserService

class UserServiceImpl(private val repository: UserRepository) : UserService {
    override fun getAll(): List<User> {
        return repository.findAll()
    }

    override fun getById(id: Long): User? {
        return repository.findById(id)
    }
}

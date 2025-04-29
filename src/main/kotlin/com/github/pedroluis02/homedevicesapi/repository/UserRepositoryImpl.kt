package com.github.pedroluis02.homedevicesapi.repository

import com.github.pedroluis02.homedevicesapi.domain.User
import com.github.pedroluis02.homedevicesapi.domain.UserRepository

class UserRepositoryImpl : UserRepository {
    private val users = arrayListOf(
        User(1, "Admin")
    )

    override fun findAll(): List<User> {
        return users
    }

    override fun findById(id: Long): User? {
        return users.firstOrNull { it.id == id }
    }
}

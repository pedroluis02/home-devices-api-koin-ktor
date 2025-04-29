package com.github.pedroluis02.homedevicesapi.domain

interface UserService {
    fun getAll(): List<User>
    fun getById(id: Long): User?
}

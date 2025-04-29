package com.github.pedroluis02.homedevicesapi.domain

interface UserRepository {
    fun findAll(): List<User>
    fun findById(id: Long): User?
}

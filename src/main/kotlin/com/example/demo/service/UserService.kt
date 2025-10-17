package com.example.demo.service

import com.example.demo.entity.User

interface UserService {
    fun findAll(): List<User>
}

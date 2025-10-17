package com.example.demo.service.impl

import com.example.demo.entity.User
import com.example.demo.repository.UserRepository
import com.example.demo.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {
    override fun findAll(): List<User> = userRepository.findAll()
}

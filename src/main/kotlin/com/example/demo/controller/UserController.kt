package com.example.demo.controller

import com.example.demo.dto.response.UserResponse
import com.example.demo.mapper.UserMapper
import com.example.demo.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService,
    private val userMapper: UserMapper,
) {
    @GetMapping
    fun getAll(): List<UserResponse> = userService.findAll().map { userMapper.toDto(it) }
}

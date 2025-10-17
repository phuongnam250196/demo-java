package com.example.demo.mapper

import com.example.demo.dto.request.UserRequest
import com.example.demo.dto.response.UserResponse
import com.example.demo.entity.User
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper {
    fun toDto(user: User): UserResponse
    fun toEntity(dto: UserRequest): User
}

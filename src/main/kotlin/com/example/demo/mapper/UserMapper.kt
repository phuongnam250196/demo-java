package com.example.demo.mapper

import com.example.demo.dto.request.UserRequest
import com.example.demo.dto.response.UserResponse
import com.example.demo.entity.User
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface UserMapper {
    fun toDto(user: User): UserResponse

    @Mapping(target = "id", ignore = true)
    fun toEntity(userRequest: UserRequest): User
}

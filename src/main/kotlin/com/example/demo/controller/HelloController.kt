package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun home(): String {
        return "Hello from Kotlin Spring Boot 2 232!"
    }
}

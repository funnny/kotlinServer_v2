package com.yul.kotlinserver.domain.user.controller

import com.yul.kotlinserver.global.auth.entity.User
import com.yul.kotlinserver.global.auth.repository.AuthRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController {

    @Autowired
    lateinit var authRepository: AuthRepository

    @GetMapping
    fun getUserInfo(): User? {
        return authRepository.findByName(name = "yul")
    }
}
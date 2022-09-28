package com.yul.kotlinserver.global.auth.repository

import com.yul.kotlinserver.global.auth.entity.User
import org.springframework.data.repository.CrudRepository

interface AuthRepository: CrudRepository<User, Int> {
    fun findByName(name:String): User?
}
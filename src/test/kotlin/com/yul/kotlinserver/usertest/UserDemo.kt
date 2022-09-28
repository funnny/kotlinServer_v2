package com.yul.kotlinserver.usertest

import com.yul.kotlinserver.global.auth.entity.User
import com.yul.kotlinserver.global.auth.repository.AuthRepository

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.junit4.SpringRunner
import javax.persistence.EntityManager
import javax.persistence.Table

@ExtendWith(SpringExtension::class)
@TestPropertySource("classpath:application-test.properties")
@DataJpaTest(showSql = true)
open class UserDemo {

    @Autowired
    lateinit var authRepository: AuthRepository
    @Autowired
    lateinit var entityManager: EntityManager

    @BeforeEach
    fun setup() {
        authRepository.save(User(name = "yul"))
        authRepository.save(User(name = "bob"))
        entityManager.clear()
    }

    @Test
    fun simple() {
        println(authRepository.findByName("bob"))
    }
}
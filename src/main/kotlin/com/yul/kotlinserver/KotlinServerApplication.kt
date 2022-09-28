package com.yul.kotlinserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class KotlinServerApplication


fun main(args: Array<String>) {
    runApplication<KotlinServerApplication>(*args)
}

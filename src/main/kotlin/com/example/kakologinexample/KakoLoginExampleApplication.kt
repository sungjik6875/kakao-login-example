package com.example.kakologinexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
class KakoLoginExampleApplication

fun main(args: Array<String>) {
    runApplication<KakoLoginExampleApplication>(*args)
}

package com.example.kotlinspringtutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringTutorialApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringTutorialApplication>(*args)
}

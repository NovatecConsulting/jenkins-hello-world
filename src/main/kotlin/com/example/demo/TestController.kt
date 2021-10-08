package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping
    fun hello(): String {
        return "Hello World"
    }

    @GetMapping("/say-hello")
    fun sayHello(@RequestParam(defaultValue = "World") name: String): String {
        return "Huhuuuuu $name"
    }
}
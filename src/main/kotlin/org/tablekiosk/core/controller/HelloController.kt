package org.tablekiosk.core.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    fun sayHello(): String {
        return "Hello world"
    }
}
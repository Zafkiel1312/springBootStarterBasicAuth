package com.github.zafkiel1312.controller

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello secured world!"
    }

    @GetMapping("/public/hello")
    fun sayUnprotectedHello(): String {
        return "Unprotected hello..."
    }

    @GetMapping("/admin/hello")
    @PreAuthorize("hasAuthority('ADMIN')")
    fun sayAdminHello() = "Hello Admin!"
}
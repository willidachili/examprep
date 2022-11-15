package com.devops.examprep

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyClass {

    @GetMapping("/api/test")
    fun myString(): String{
        return "Hello my friend"
    }
}
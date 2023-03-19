package com.example.kakologinexample.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/home")
    fun home(): String {
        return "home"
    }

    @GetMapping("/kakao/test")
    fun kakaoLogin(): String {
        return "login"
    }
}
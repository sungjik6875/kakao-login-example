package com.example.kakologinexample.controller

import org.springframework.security.core.Authentication
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpServletRequest

@Controller
class HomeController(private val authorizedClientService: OAuth2AuthorizedClientService) {
    @GetMapping("/login")
    fun home(): String {
        return "login"
    }

    @GetMapping("/")
    fun loginSuccess(authentication: Authentication, model: Model, request: HttpServletRequest): String {
        val oauth2Authentication = authentication as OAuth2AuthenticationToken
        val user: OAuth2User = oauth2Authentication.principal
        val kakaoUser = user.attributes["kakao_account"] as Map<*, *>
        model.addAttribute("age", kakaoUser["age_range"])
        model.addAttribute("gender", kakaoUser["gender"])

        return "home"
    }
    @GetMapping("/loginFailure")
    fun loginFailure(): String {
        return "home"
    }
}
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // templates/login.html を表示
    }
    
    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // ログイン後に表示するトップページ（作っておく）
    }

}

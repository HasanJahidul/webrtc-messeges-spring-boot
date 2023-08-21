package com.jahidulhasan.messages.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/")
    public String Hello() {
        return "Hello from Jahidul Hasan";
    }
}

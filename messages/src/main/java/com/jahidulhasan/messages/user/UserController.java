package com.jahidulhasan.messages.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/asd")
    public String hello() {
        return "Hello World";
    }

}

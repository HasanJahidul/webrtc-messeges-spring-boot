package com.arits.messages.user.rest;

import com.arits.messages.user.entity.User;
import com.arits.messages.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public ResponseEntity<?> add(@RequestBody User user) {
        if(user == null) {
            throw new RuntimeException("User can not be null");
        }
        User save = userService.add(user);
        return ResponseEntity.ok(save);
//        return user;
    }

}

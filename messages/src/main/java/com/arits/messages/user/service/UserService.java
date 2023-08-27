package com.arits.messages.user.service;

import com.arits.messages.user.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
//    add user
    User add(User user);
//    update user
    User update(User user);
//    delete user
    void delete(String id);
//    get user
    User get(String id);
//    get all users
    User [] getAll();

}

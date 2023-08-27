package com.arits.messages.user.service;

import com.arits.messages.user.entity.User;
import com.arits.messages.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

//        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public User[] getAll() {
        return new User[0];
    }
}

package com.springintrolab.services;

import com.springintrolab.models.User;
import com.springintrolab.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(User user) {
        this.userRepository.save(user);
    }
}

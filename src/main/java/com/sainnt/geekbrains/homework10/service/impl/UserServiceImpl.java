package com.sainnt.geekbrains.homework10.service.impl;

import com.sainnt.geekbrains.homework10.entity.User;
import com.sainnt.geekbrains.homework10.repository.UserRepository;
import com.sainnt.geekbrains.homework10.service.CRUDServiceImpl;
import com.sainnt.geekbrains.homework10.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CRUDServiceImpl<User> implements UserService {

    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
    }
}

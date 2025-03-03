package com.lucasdavid.basicAuthAPI.services;

import com.lucasdavid.basicAuthAPI.entities.User;
import com.lucasdavid.basicAuthAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User insert(User obj) {
        return repository.save(obj);
    }
}

package com.lucasdavid.basicAuthAPI.services;

import com.lucasdavid.basicAuthAPI.entities.User;
import com.lucasdavid.basicAuthAPI.configuration.SecurityConfig;
import com.lucasdavid.basicAuthAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private SecurityConfig security;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User insert(User obj) {
        hashPassword(obj);
        return repository.save(obj);
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new NullPointerException());
    }

    private void hashPassword(User obj) {
        obj.setPassword(security.passwordEncoder().encode(obj.getPassword()));
    }
}

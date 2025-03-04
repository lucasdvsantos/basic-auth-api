package com.lucasdavid.basicAuthAPI.resources;

import com.lucasdavid.basicAuthAPI.entities.User;
import com.lucasdavid.basicAuthAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @PostMapping(value = "/register")
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}

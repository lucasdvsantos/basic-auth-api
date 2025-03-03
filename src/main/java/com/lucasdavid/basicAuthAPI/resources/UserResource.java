package com.lucasdavid.basicAuthAPI.resources;

import com.lucasdavid.basicAuthAPI.entities.User;
import com.lucasdavid.basicAuthAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
}

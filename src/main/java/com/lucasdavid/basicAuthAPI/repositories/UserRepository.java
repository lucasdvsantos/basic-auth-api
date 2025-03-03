package com.lucasdavid.basicAuthAPI.repositories;

import com.lucasdavid.basicAuthAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

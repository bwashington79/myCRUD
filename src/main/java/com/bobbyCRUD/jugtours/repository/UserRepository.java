package com.bobbyCRUD.jugtours.repository;

import com.bobbyCRUD.jugtours.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
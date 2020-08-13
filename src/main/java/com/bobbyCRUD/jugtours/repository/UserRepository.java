package com.bobbyCRUD.jugtours.repository;

import com.bobbyCRUD.jugtours.model.OLD_ENTITY.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByName(String name);
}
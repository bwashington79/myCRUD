package com.bobbyCRUD.jugtours.repository;

import com.bobbyCRUD.jugtours.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}
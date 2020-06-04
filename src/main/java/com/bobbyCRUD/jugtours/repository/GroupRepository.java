package com.bobbyCRUD.jugtours.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupsEntity, Long> {
    GroupsEntity findByName(String name);
}
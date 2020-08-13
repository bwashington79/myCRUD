package com.bobbyCRUD.jugtours.repository;

import com.bobbyCRUD.jugtours.model.OLD_ENTITY.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupEntity, Long> {
    GroupEntity findByName(String name);
}
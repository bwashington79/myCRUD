package com.bobbyCRUD.jugtours.repository;

//import com.bobbyCRUD.jugtours.model.GroupEntity;
import com.bobbyCRUD.jugtours.model.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupEntity, Long> {
    GroupEntity findByName(String name);
}
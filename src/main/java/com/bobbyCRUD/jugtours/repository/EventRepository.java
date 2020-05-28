package com.bobbyCRUD.jugtours.repository;

//import com.bobbyCRUD.jugtours.model.OLD_ENTITY.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bobbyCRUD.jugtours.model.EventEntity;


public interface EventRepository extends JpaRepository<EventEntity, Long> {
    EventEntity findByTitle(String name);
}
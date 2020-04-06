package com.bobbyCRUD.jugtours.repository;

import com.bobbyCRUD.jugtours.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findByTitle(String name);
}
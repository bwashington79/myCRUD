package com.bobbyCRUD.jugtours.model;

//import com.bobbyCRUD.jugtours.model.OLD_ENTITY.EventEntity;
//import com.bobbyCRUD.jugtours.model.OLD_ENTITY.GroupEntity;
import com.bobbyCRUD.jugtours.model.GroupEntity;
import com.bobbyCRUD.jugtours.repository.GroupRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

@Component
class Initializer implements CommandLineRunner {

    private final GroupRepository repository;

    public Initializer(GroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Denver JUG", "Utah JUG", "Seattle JUG",
                "Richmond JUG").forEach(name ->
                repository.save(new GroupEntity())
        );

//        GroupEntity djug = repository.findByName("Denver JUG");
//        EventEntity e = new EventEntity();
//        e.setTitle("Full Stack Reactive");
//        e.setDescription("Reactive with Spring Boot + React");
//        e.setDate(Instant.parse("2018-12-12T18:00:00.000Z"));
//        djug.setEvents(Collections.singleton(e));
//        repository.save(djug);

        repository.findAll().forEach(System.out::println);
    }
}
//package com.bobbyCRUD.jugtours.model;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//import java.time.Instant;
//import java.util.Set;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "event")
//public class Event {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    private Instant date;
//    private String title;
//    private String description;
//    @ManyToMany
//    private Set<User> attendees;
//}
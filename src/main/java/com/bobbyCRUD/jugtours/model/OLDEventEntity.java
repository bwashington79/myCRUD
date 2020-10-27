//package com.bobbyCRUD.jugtours.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import java.sql.Date;
//import java.time.Instant;
//import java.util.Collection;
//import java.util.Set;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "events", schema = "public", catalog = "jugtours")
//public class EventEntity {
//    @Id@Column(name = "id", nullable = false)
//    private int id;
//    @Basic@Column(name = "date", nullable = true)
//    private Instant date;
//    @Basic@Column(name = "title", nullable = true, length = -1)
//    private String title;
//    @Basic@Column(name = "description", nullable = true, length = -1)
//    private String description;
//    @ManyToMany
//    private Set<UserEntity> attendees;
//
//}

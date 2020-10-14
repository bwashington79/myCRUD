package com.bobbyCRUD.jugtours.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "group", schema = "public", catalog = "jugtours")
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @NonNull
    @Basic@Column(name = "name", nullable = false, length = -1)
    private String name;
    @Basic@Column(name = "address", nullable = true, length = -1)
    private String address;
    @Basic@Column(name = "city", nullable = true, length = -1)
    private String city;
    @Basic@Column(name = "state_province", nullable = true, length = 3)
    private String stateProvince;
    @Basic@Column(name = "country", nullable = true, length = -1)
    private String country;
    @Basic@Column(name = "postal_code", nullable = true)
    private Integer postalCode;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private UserEntity user;

//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private Set<EventEntity> events;
}

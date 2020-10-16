package com.bobbyCRUD.jugtours.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users", schema = "public", catalog = "jugtours")
public class UserEntity {
    @Id@Column(name = "id", nullable = false)
    private int id;
    @Basic@Column(name = "name", nullable = true, length = -1)
    private String name;
    @Basic@Column(name = "email", nullable = true, length = -1)
    private String email;
}
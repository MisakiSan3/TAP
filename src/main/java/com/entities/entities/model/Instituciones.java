package com.entities.entities.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "institucion")
public class Instituciones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "proveedor_instituciones",
        joinColumns = @JoinColumn(name = "proveedores_id"),
        inverseJoinColumns = @JoinColumn(name = "instituciones_id"))
    private Set<Proveedores> proveedores = new HashSet<>();
}
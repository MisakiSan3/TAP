package com.entities.entities.model;

import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedor")
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    
    @Column(name = "name")
    private String name;

    @ManyToMany
    private Set<Instituciones> instituciones = new HashSet<>();
}

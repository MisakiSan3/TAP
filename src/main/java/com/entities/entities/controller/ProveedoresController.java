package com.entities.entities.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.entities.model.Proveedores;
import com.entities.entities.service.ProveedoresService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/proveedores")
@CrossOrigin({"*"})
public class ProveedoresController {
    @Autowired
    private ProveedoresService proveedoresService;

    @PostMapping("/save")
    public Proveedores saveProveedores(@RequestBody Proveedores entity) {
        
        
        return proveedoresService.saveProveedor(entity);
    }

     @GetMapping("/{id}")
    public Proveedores findProveedores(@PathVariable long id)
    {
        return proveedoresService.findById(id);
    }
    @PutMapping("/{id}")
    public Proveedores update(@RequestBody Proveedores entity)
    {
        return proveedoresService.saveProveedor(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        proveedoresService.deleteByID(id);
    }

    @GetMapping("/")
    public Iterable<Proveedores> findAll()
    {
        return proveedoresService.findAll();
    }
    
}

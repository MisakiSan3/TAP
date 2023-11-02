package com.entities.entities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.entities.model.Instituciones;
import com.entities.entities.service.InstitucionesService;


@RestController
@RequestMapping("api/instituciones")
@CrossOrigin({"*"})
public class InstitucionesController {
    @Autowired
    private InstitucionesService institucionesService;

    @PostMapping("/save")
    public Instituciones saveProveedores(@RequestBody Instituciones entity) {
        
        
        return institucionesService.saveInstituciones(entity);
    }

     @GetMapping("/{id}")
    public Instituciones findProveedores(@PathVariable long id)
    {
        return institucionesService.findById(id);
    }
    @PutMapping("/{id}")
    public Instituciones update(@RequestBody Instituciones entity)
    {
        return institucionesService.saveInstituciones(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        institucionesService.deleteByID(id);
    }

    @GetMapping("/")
    public Iterable<Instituciones> findAll()
    {
        return institucionesService.findAll();
    }
}

package com.entities.entities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.entities.model.Instituciones;
import com.entities.entities.repository.InstitucionesRepository;





@Service
public class InstitucionesService {
    @Autowired
    private InstitucionesRepository institucionesRepository;


    public Instituciones saveInstituciones(Instituciones institucion){

        return institucionesRepository.save(institucion);
    }

    public Instituciones findById(long id)
    {
        return institucionesRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        institucionesRepository.deleteById(id);
    }

    public Iterable<Instituciones> findAll()
    {
        return institucionesRepository.findAll();
    }
}

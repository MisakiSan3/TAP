package com.entities.entities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.entities.model.Proveedores;
import com.entities.entities.repository.ProveedoresRepository;





@Service
public class ProveedoresService {
    @Autowired
    private ProveedoresRepository proveedoresRepository;


    public Proveedores saveProveedor(Proveedores proveedor){

        return proveedoresRepository.save(proveedor);
    }

    public Proveedores findById(long id)
    {
        return proveedoresRepository.findById(id).orElse(null);
    }

    public void deleteByID (long id)
    {
        proveedoresRepository.deleteById(id);
    }

    public Iterable<Proveedores> findAll()
    {
        return proveedoresRepository.findAll();
    }
}

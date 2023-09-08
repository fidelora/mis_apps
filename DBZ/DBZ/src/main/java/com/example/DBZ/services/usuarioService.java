
package com.example.DBZ.services;

import com.example.DBZ.repositorio.imagenRepositorio;
import com.example.DBZ.repositorio.uuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService {
    
    @ Autowired 
    private uuarioRepositorio userRepo;
    
    @Autowired
    private imagenRepositorio imgRepo;
}

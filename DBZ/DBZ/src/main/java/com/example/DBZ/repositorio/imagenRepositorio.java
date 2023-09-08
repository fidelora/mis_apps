
package com.example.DBZ.repositorio;

import com.example.DBZ.entidades.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface imagenRepositorio extends JpaRepository<Imagen,String>{
}


package com.example.DBZ.repositorio;

import com.example.DBZ.entidades.personajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface personajesRepositorio extends JpaRepository<personajes,String> {
    @Query("SELECT p FROM p WHEE p.nombre  = :nombre")
    public personajes buscarpornombre(@Param("nombre")String nombre);
}


package com.example.DBZ.repositorio;

import com.example.DBZ.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface uuarioRepositorio extends JpaRepository<Usuario,String> {
     @Query("SELECT u FROM usuario u  WHERE u.email= :email")
    public Usuario buscarPorEmail(@Param("email")String email);
}

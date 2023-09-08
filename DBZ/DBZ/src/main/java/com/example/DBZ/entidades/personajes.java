
package com.example.DBZ.entidades;

import com.example.DBZ.enumeraciones.raza;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class personajes {
       @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
       
       
       private String nombre;
       private Integer poder;
       private raza Raza;
       private String descripcion;
         @OneToOne
       private Imagen imagen;

    public personajes() {
    }

    public personajes(String id, Imagen imagen, String nombre, Integer poder, raza Raza, String descripcion) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.poder = poder;
        this.Raza = Raza;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoder() {
        return poder;
    }

    public void setPoder(Integer poder) {
        this.poder = poder;
    }

    public raza getRaza() {
        return Raza;
    }

    public void setRaza(raza Raza) {
        this.Raza = Raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
       
       
}

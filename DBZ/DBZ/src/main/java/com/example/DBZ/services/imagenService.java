
package com.example.DBZ.services;

import com.example.DBZ.entidades.Imagen;
import com.example.DBZ.excepciones.MiException;
import com.example.DBZ.repositorio.imagenRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class imagenService {
    @Autowired
    private imagenRepositorio imgRepo;
    
    public Imagen guardar(MultipartFile archivo) throws MiException{
        if (archivo != null) {
            try{
                Imagen img = new Imagen();
                img.setMine(archivo.getContentType());
                img.setContenido(archivo.getBytes());
                return imgRepo.save(img);
            }catch( Exception e){
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
    public Imagen actualizar(MultipartFile archivo, String idImagen) throws MiException{
        if (archivo != null) {
            try{
            Imagen img = new Imagen();
            if (idImagen != null) {
                Optional<Imagen> respuesta = imgRepo.findById( idImagen);
                if (respuesta.isPresent()) {
                    img = respuesta.get();
                }
            }
            img.setMine(archivo.getContentType());
            img.setContenido(archivo.getBytes());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}

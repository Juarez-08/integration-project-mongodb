package com.example.persistence_layer.servicios;

import com.example.persistence_layer.modelos.Ejemplo;
import com.example.persistence_layer.repositorios.EjemploRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjemploService {

    @Autowired
    private EjemploRepository ejemploRepository;

    /**
     * Guarda un ejemplo en la base de datos.
     *
     * @param ejemplo El ejemplo a guardar.
     * @return El ejemplo guardado.
     */
    public Ejemplo guardarEjemplo(Ejemplo ejemplo) {
        return ejemploRepository.save(ejemplo);
    }

    /**
     * Obtiene todos los ejemplos almacenados en la base de datos.
     *
     * @return Una lista de todos los ejemplos.
     */
    public List<Ejemplo> obtenerTodos() {
        return ejemploRepository.findAll();
    }
}

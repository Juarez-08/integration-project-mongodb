package com.example.persistence_layer.controladores;

import com.example.persistence_layer.modelos.Ejemplo;
import com.example.persistence_layer.servicios.EjemploService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ejemplos")
public class EjemploController {

    private final EjemploService ejemploService;

    @Autowired
    public EjemploController(EjemploService ejemploService) {
        this.ejemploService = ejemploService;
    }

    /**
     * Crea un nuevo ejemplo.
     * @param ejemplo El ejemplo a crear.
     * @return El ejemplo creado.
     */
    @PostMapping
    public Ejemplo crearEjemplo(@RequestBody Ejemplo ejemplo) {
        return ejemploService.guardarEjemplo(ejemplo);
    }

    /**
     * Obtiene todos los ejemplos existentes.
     * @return Lista de todos los ejemplos.
     */
    @GetMapping
    public List<Ejemplo> obtenerTodos() {
        return ejemploService.obtenerTodos();
    }
}

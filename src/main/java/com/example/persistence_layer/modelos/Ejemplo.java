package com.example.persistence_layer.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ejemplos")
public class Ejemplo {

    @Id
    private String id;

    private String nombre;

    // Getters y setters

    /**
     * Obtiene el ID del ejemplo.
     * @return El ID del ejemplo.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del ejemplo.
     * @param id El nuevo ID del ejemplo.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del ejemplo.
     * @return El nombre del ejemplo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del ejemplo.
     * @param nombre El nuevo nombre del ejemplo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

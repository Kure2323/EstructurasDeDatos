package org.example.equals_hashcode;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Peticion {

    private String id;
    private String nombre;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Peticion peticion = (Peticion) o;
        return Objects.equals(id, peticion.id) && Objects.equals(nombre, peticion.nombre);
    }

    @Override
    public String toString() {
        return "Peticion{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    public Peticion(String id, String nombre) {
        this.id = id;
        this.nombre = nombreArchivo(nombre);
    }

    private String nombreArchivo(String nombre) {
        if (nombre.endsWith(".pdf")) {
            return nombre;
        }
        return null;
    }






}

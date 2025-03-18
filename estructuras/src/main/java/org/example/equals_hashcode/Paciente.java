package org.example.equals_hashcode;

import java.util.Objects;

public class Paciente {

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(sip, paciente.sip) && Objects.equals(nombre, paciente.nombre) && Objects.equals(apellidos, paciente.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sip, nombre, apellidos);
    }

    private String sip;
    private String nombre;
    private String apellidos;

    @Override
    public String toString() {
        return "Paciente{" +
                "sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    public Paciente(String sip, String nombre, String apellidos) {
        this.sip = sip;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }



}

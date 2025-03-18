package org.example.equals_hashcode;

public class Persona {

    private int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }







}

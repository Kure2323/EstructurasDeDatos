package org.example.equals_hashcode.Ejercicio3;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;

@Getter @Setter
public class Informe {

    private int codigo;
    private Tipo tarea;
    private String descripcion;
    private static HashSet<Informe> listaTareas = new HashSet<>();

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", tarea=" + tarea +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public static void getNumTareas() {

        System.out.println("Hay en realidad: " + listaTareas.size() + " tareas.");

        for (Informe inf : listaTareas) {
            System.out.println(inf);
        }

    }

    public static void quitarTarea(Informe inf) {

        listaTareas.remove(inf);

    }

    public Informe(int codigo, Tipo tarea, String descripcion) {
        this.codigo = codigo;
        this.tarea = tarea;
        this.descripcion = descripcion;
        listaTareas.add(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tarea == informe.tarea;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tarea);
    }


}

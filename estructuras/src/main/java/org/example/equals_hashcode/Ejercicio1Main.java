package org.example.equals_hashcode;

import java.util.LinkedHashSet;

public class Ejercicio1Main {
    static final String id = "PC3493";
    static LinkedHashSet<Peticion> listaPeticiones = new LinkedHashSet<>();

    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.txt");
        anyadirDocumento("prueba1.pdf");
        anyadirDocumento("prueba2.pdf");
        anyadirDocumento("prueba2.pdf");

        imprimirDocumento();

        System.out.println("Quedan " + getNumPeticiones() + " en la cola.");
        verTodo();
        imprimirTodo();


    }

    public static void anyadirDocumento(String nombre_fichero) {

        if (nombre_fichero.endsWith(".pdf")) {
            if (listaPeticiones.add(new Peticion(id, nombre_fichero))) {
                System.out.println("Fichero " + nombre_fichero + " añadido a la cola de impresión.");
            }else{
                System.out.println("El archivo " + nombre_fichero + " ya existe en la cola.");
            }
        } else {
            System.out.println("El archivo " + nombre_fichero + " no tiene el formato requerido (.pdf)");
        }

    }

    public static  void imprimirDocumento() {

        System.out.println("Imprimiento... " + listaPeticiones.removeFirst().getNombre());


    }

    public static int getNumPeticiones() {
        return listaPeticiones.size();
    }

    public static void verTodo() {
        System.out.println("Peticiones[ " + listaPeticiones + " ]");
    }

    public static void imprimirTodo() {
        while (!listaPeticiones.isEmpty()) {
            imprimirDocumento();
        }

        System.out.println("La cola está vacía.");
    }

}

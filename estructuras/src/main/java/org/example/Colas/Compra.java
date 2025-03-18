package org.example.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Compra {

    static Scanner in = new Scanner(System.in);

    private static void mostrarMenu() {

        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");
        System.out.println();
        System.out.println("Seleccione una opción: ");

    }

    private static void seleccionarOpcion() {

        switch (in.next()){

        }


    }


    static Deque<String> cola = new LinkedList<>();
    public static void main(String[] args) {

        mostrarMenu();




    }

}

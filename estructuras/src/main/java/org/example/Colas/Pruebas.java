package org.example.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Pruebas {

    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        ejercicio5Palindromo();
    }

    private static void ejercicio5Palindromo() {
        Deque<String> cola_doble = new LinkedList<>();

        System.out.println("Introduce una palabra palíndroma:");
        String[] array = in.next().split("");
        for (int i = 0; i < array.length; i++) {
            cola_doble.offer(array[i]);
        }

        boolean palindromo = true;
        while (!cola_doble.isEmpty()) {

            if (cola_doble.size() != 1) {
                if (!cola_doble.pollFirst().equalsIgnoreCase(cola_doble.pollLast())) {
                    palindromo = false;
                    break;
                }
            } else {
                cola_doble.poll();
            }


        }

        if (palindromo) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    private static void ejercicio2() {

        Queue<String> cola = new LinkedList<>();

        for (int i = 0; i < 5; i++) {

            cola.offer("Imprimir documento " + Integer.toString(i+1));

        }

        while (!cola.isEmpty()) {

            if (cola.size() == 5) {
                System.out.println("Estado de la cola de impresión: " + cola);
            } else {
                System.out.println("Estado de la cola después de procesar el trabajo: " + cola);
            }
            System.out.println("Procesando: " +cola.poll());

            if (cola.isEmpty()) {
                System.out.println("Estado de la cola después de procesar el trabajo: " + cola);
                System.out.println("No hay más trabajos en la cola de impresión.");
            }

        }

    }

    private static void ejercicio3() {

        Queue<String> cola = new LinkedList<>();

        cola.offer("Chop Suey");
        cola.offer("Lonely Day");
        cola.offer("ATWA");
        cola.offer("Radio/Video");
        cola.offer("Aerials");

        System.out.println("Estado inicial de la playlist: " + cola);
        System.out.println("Reproduciendo: " +cola.poll());

        while (!cola.isEmpty()) {

            System.out.println("estado de la playlist después de reproducir una canción: " + cola);
            System.out.println("Reproduciendo: " + cola.poll());


        }

    }

    private static void ejercicio4() {



    }


}

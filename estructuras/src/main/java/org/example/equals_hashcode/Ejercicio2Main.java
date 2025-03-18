package org.example.equals_hashcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio2Main {
    static Random rdm = new Random();
    static Queue<Persona> listaCine = new LinkedList<>();

    public static void main(String[] args) {

        generarCola();
        System.out.println("*** CINE AL POBLE ***");
        System.out.println("Hay " + listaCine.size() + " a la cola: " +listaCine);
        totalRecaudado();
        System.out.println(listaCine);



    }

    public static void generarCola() {
        int cantidad = rdm.nextInt(0,251);
        for (int i = 0; i < cantidad; i++) {
            listaCine.add(new Persona(rdm.nextInt(3,101)));
        }
    }

    public static void totalRecaudado() {
        double sumatorio = 0;
        while (!listaCine.isEmpty()) {
            if (listaCine.peek().getEdad() >= 3 && listaCine.peek().getEdad() <= 10) {
                sumatorio += 1;
            } else if (listaCine.peek().getEdad() >= 11 && listaCine.peek().getEdad() <= 17) {
                sumatorio += 2.5;
            } else {
                sumatorio += 3.5;
            }
            listaCine.poll();
        }
        System.out.println(sumatorio);

    }

}

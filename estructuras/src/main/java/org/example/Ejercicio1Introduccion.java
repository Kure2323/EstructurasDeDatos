package org.example;

import java.util.*;

public class Ejercicio1Introduccion {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce la operación matemática:");

        String operacion = in.next();
        if (esBalanceado(operacion)) {
            System.out.println("Está equilibrada.");
        } else {
            System.out.println("No está equilibrada.");
        }


    }

    private static boolean esBalanceado(String operacion) {
        String[] array = operacion.split("");
        Stack<String> pila = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("(")) {
                pila.push(array[i]);
            } else if (array[i].equals(")") && pila.contains(")")) {
                pila.pop();
            }
        }

        if (pila.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }



    private static void ejercicio2() {
        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el número " + (i+1) + ":");
            pila.push(in.nextInt());
        }
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }

    private static void ejercicio1() {
        Stack<Character> pila = new Stack<>();
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');

        if (pila.isEmpty()) {
            System.out.println("La lista está vacía.");
        }

        System.out.println(pila.size());
        System.out.println(pila.peek());
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }


}

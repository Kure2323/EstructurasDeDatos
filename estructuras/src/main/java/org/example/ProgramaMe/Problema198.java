package org.example.ProgramaMe;
// Esquema de la entrada: fin de la entrada
import java.util.*;

public class Problema198 {

    static Scanner in;

    public static boolean casoDePrueba() {

        if (!in.hasNext())
            return false;
        else {


            String[] cadena = in.nextLine().split("");
            Stack<Integer> pila = new Stack<>();
            Queue<Integer> cola = new LinkedList<>();
            int resultPila = pila.push(Integer.parseInt(cadena[0]));
            int resultCola = Integer.parseInt(cadena[0]);
            cola.add(Integer.parseInt(cadena[0]));

            System.out.println(Arrays.toString(cadena));




            for (int i = 1; i < cadena.length; i++) {
                try {
                    pila.push(Integer.parseInt(cadena[i]));
                    cola.add(Integer.parseInt(cadena[i]));
                } catch (NumberFormatException e) {
                    switch (cadena[i]){
                        case "/":
                            resultPila /= pila.pop();
                            resultCola /= cola.poll();
                            break;
                        case "+":
                            resultPila += pila.pop();
                            resultCola += cola.poll();
                            break;
                        case "-":
                            resultPila -= pila.pop();
                            resultCola -= cola.poll();
                            break;
                        case "*":
                            resultPila *= pila.pop();
                            resultCola *= cola.poll();
                            break;
                    }
                }
            }
            switch (cadena[cadena.length-1]){
                case "/":
                    resultPila /= pila.pop();
                    resultCola /= cola.poll();
                    break;
                case "+":
                    resultPila += pila.pop();
                    resultCola += cola.poll();
                    break;
                case "-":
                    resultPila -= pila.pop();
                    resultCola -= cola.poll();
                    break;
                case "*":
                    resultPila *= pila.pop();
                    resultCola *= cola.poll();
                    break;
            }

            System.out.println(pila);
            System.out.println(cola);

            System.out.println(resultPila + " " + resultCola);





            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main

} // class Solution
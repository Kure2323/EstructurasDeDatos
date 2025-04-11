package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una frase...");

        String palabras = in.next();
        HashMap<Character,Integer> contador = new HashMap<>();

        for (Character letras : palabras.toCharArray()) {
            //getOrDefaul ya que aún no están en el mapa, por eso no se hace un get normal
            contador.put(letras,contador.getOrDefault(letras,0) + 1);

        }

        for (Map.Entry<Character,Integer> asdf : contador.entrySet()) {
            System.out.println(asdf.getKey() + ": " + asdf.getValue());

        }


    }

}

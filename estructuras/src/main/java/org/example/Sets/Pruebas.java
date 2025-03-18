package org.example.Sets;

import com.sun.source.tree.Tree;

import java.util.*;

public class Pruebas {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Set<Character> letras = new HashSet<>();
//
//        letras.add('e');
//        letras.add('c');
//        letras.add('b');
//        letras.add('d');
//        letras.add('a');
//
//        System.out.println(letras);
//        System.out.println();
//
//        Set<Character> letras_enlazadas = new LinkedHashSet<>();
//
//        letras_enlazadas.add('e');
//        letras_enlazadas.add('d');
//        letras_enlazadas.add('c');
//        letras_enlazadas.add('b');
//        letras_enlazadas.add('a');
//
//        System.out.println(letras_enlazadas.add('a'));
//        System.out.println(letras_enlazadas);
//
//        System.out.println();
//
//        Set<Character> letras_ordenadas = new TreeSet<>();
//
//        letras_ordenadas.add('v');
//        letras_ordenadas.add('n');
//        letras_ordenadas.add('d');
//        letras_ordenadas.add('p');
//        letras_ordenadas.add('p');
//
//        System.out.println(letras_ordenadas);
//
//        letras_ordenadas.remove('n');
//
//        System.out.println(letras_ordenadas);

        TreeSet<Integer> lista1 = new TreeSet<>();
        TreeSet<Integer> lista2 = new TreeSet<>();

        lista1.add(9);
        lista1.add(1);
        lista1.add(5);


        lista2.add(15);
        lista2.add(6);
        lista2.add(12);
        lista2.add(3);
        lista2.add(7);


        System.out.println(mezclados(lista1, lista2));


    }

    private static TreeSet<Integer> mezclados(TreeSet<Integer> lista1, TreeSet<Integer> lista2) {

        TreeSet<Integer> listaNueva = new TreeSet<>();

        while (!lista1.isEmpty() || !lista2.isEmpty()) {
            if (lista1.isEmpty()){
                listaNueva.add(lista2.pollFirst());
            } else if (lista2.isEmpty()) {
                listaNueva.add(lista1.pollFirst());
            } else {
                listaNueva.add(lista1.pollFirst());
                listaNueva.add(lista2.pollFirst());
            }


            System.out.println(lista1);
            System.out.println(lista2);
        }

        return listaNueva;

    }

    private static void ejercicio3() {
        String entrada = "";
        Set<String> url = new LinkedHashSet<>();
        while (!entrada.equalsIgnoreCase("Salir")) {
            entrada = "";
            System.out.println("Escribe una URL visitada (o 'salir' para terminar):");
            entrada = in.next();
            if (!entrada.equalsIgnoreCase("salir")) {
                url.add(entrada);
            }
            System.out.println(entrada);
        }

        System.out.println("Historial de navegación:");
        int i = 1;
        for (String pal : url) {
            System.out.println(i + ". " + pal);
            i++;
        }
    }

    private static void ejercicio1() {
        System.out.println("Ingresa una frase:");

        String[] entrada = in.nextLine().split(" ");

        Set<String> palabras = new HashSet<>();

        for (int i = 0; i < entrada.length; i++) {
            palabras.add(entrada[i].toLowerCase());
        }

        System.out.println("Palabras únicas: " + palabras);
    }


}

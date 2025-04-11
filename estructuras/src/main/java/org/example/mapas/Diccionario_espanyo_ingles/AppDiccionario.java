package org.example.mapas.Diccionario_espanyo_ingles;

public class AppDiccionario {


    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();
        diccionario.nuevoPar("Perro", "Dog");
        diccionario.nuevoPar("Gato", "Cat");

        System.out.println(diccionario.traduce("Gato"));
        System.out.println(diccionario.palabraAleatoria());

    }


}

package org.example.Inmutabilidad;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {

        Juego pokemon = new Juego("Pokemon Planta", 100);

        List<String> listaPokemon = pokemon.getLista_personajes();

        listaPokemon.add("Pikachu");

        pokemon.getLista_personajes().add("Squirtle");
        pokemon.getLista_personajes().add("Charmander");



        System.out.println(pokemon.getLista_personajes());









    }

}

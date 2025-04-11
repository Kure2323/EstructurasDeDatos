package org.example.mapas.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperatura {
    static Scanner in = new Scanner(System.in);

    private HashMap<String,Integer> mapaTemperaturas;

    public RegistroTemperatura() {
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperatura(String ciudad, Integer temp) {
        mapaTemperaturas.put(ciudad,temp);
    }

    public void actualizarTemperatura(String ciudad) {
        if (mapaTemperaturas.containsKey(ciudad)) {
            System.out.println("Inserta una temperatura para " + ciudad);
            mapaTemperaturas.put(ciudad, in.nextInt());
        } else {
            System.out.println("No está la ");
        }
    }

    public void consultarTemperatura() {
        System.out.println("Introduce la ciudad de la que quieres saber la temperatura:");
        String ciudad = in.next();
        if (mapaTemperaturas.containsKey(ciudad))
            System.out.println(mapaTemperaturas.get(ciudad));
        else
            System.out.println(ciudad + " no tiene temperaturas registradas.");
    }

    public void mostrarTodo() {
        for (Map.Entry<String,Integer> ent : mapaTemperaturas.entrySet()) {
            System.out.println(ent);
        }
    }

    @Override
    public String toString() {
        return "RegistroTemperatura{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }
}

package org.example.mapas.Diccionario_espanyo_ingles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Diccionario {

    static Random rdm = new Random();

    private HashMap <String, String>  diccionario;

    public Diccionario(){
        diccionario = new HashMap<>();
    }

    public void nuevoPar(String esp, String ing) {

        diccionario.put(esp, ing);
        System.out.println("Datos introducidos correctamente.");

    }

    public String traduce(String esp) {
        return diccionario.get(esp);
    }

    public String palabraAleatoria() {

        int cont = 0;
        int bingo = rdm.nextInt(diccionario.size());

        for (Map.Entry<String,String> let : diccionario.entrySet()) {
            if (cont == bingo)
                return let.getKey();
            cont++;
        }
        return null;
    }

}

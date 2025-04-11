package org.example.mapas.Ejercicio3;

public class AppDana {

    public static void main(String[] args) {


        RegistroTemperatura temp = new RegistroTemperatura();

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        temp.insertarTemperatura("Alicante", 32);
        System.out.println(temp);
        temp.actualizarTemperatura("Alicante");
        System.out.println(temp);
        temp.consultarTemperatura();
        temp.mostrarTodo();


    }

}

package org.example.equals_hashcode.Ejercicio3;

import java.util.Stack;

public class AppFuncionario {


    public static void main(String[] args) {

        Stack<Informe> pilaInformes = new Stack<>();

        pilaInformes.push(new Informe(1,Tipo.ADMINISTRATIVO,"Blabla1"));
        pilaInformes.push(new Informe(2,Tipo.EMPRESARIAL,"Blabla2"));
        pilaInformes.push(new Informe(3,Tipo.PERSONAL,"Blabla3"));
        pilaInformes.push(new Informe(1,Tipo.ADMINISTRATIVO,"Blabla4"));
        pilaInformes.push(new Informe(2,Tipo.PERSONAL,"Blabla5"));

        Informe.getNumTareas();

        while (!pilaInformes.isEmpty()) {

            System.out.println("Sale: " + pilaInformes.peek());
            Informe.quitarTarea(pilaInformes.pop());

        }

        pilaInformes.push(new Informe(1, Tipo.ADMINISTRATIVO, "Blabla6"));
        pilaInformes.push(new Informe(2, Tipo.PERSONAL, "Blabla7"));
        pilaInformes.push(new Informe(3, Tipo.EMPRESARIAL, "Blabla8"));

        while (!pilaInformes.isEmpty()) {
            System.out.println("Sale ahora: " + pilaInformes.peek());
            Informe.quitarTarea(pilaInformes.pop());
        }

        Informe.getNumTareas();

    }





}

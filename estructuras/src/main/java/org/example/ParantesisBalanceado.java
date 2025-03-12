package org.example;// Esquema de la entrada: fin de la entrada
import java.util.*;

public class ParantesisBalanceado {

    static Scanner in;

    public static boolean casoDePrueba() {

        if (!in.hasNext())
            return false;
        else {
            String[] entrada = in.nextLine().replaceAll("\\n\\d","").split("");
            Stack<String> parentesis = new Stack<>();
            Stack<String> corchete = new Stack<>();
            Stack<String> llave = new Stack<>();

            for (int i = 0; i < entrada.length; i++) {
                if (entrada[i].equals("(")) {
                    parentesis.push(entrada[i]);
                } else if (entrada[i].equals(")") && parentesis.contains(")")) {
                    parentesis.pop();
                } else if (entrada[i].equals("[")) {
                    corchete.push(entrada[i]);
                } else if (entrada[i].equals("]") && corchete.contains("]")) {
                    corchete.pop();
                } else if (entrada[i].equals("{")) {
                    llave.push(entrada[i]);
                } else if (entrada[i].equals("}") && llave.contains("}")) {
                    llave.pop();
                }

            }
            if (parentesis.isEmpty() && corchete.isEmpty() && llave.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main

} // class Solution

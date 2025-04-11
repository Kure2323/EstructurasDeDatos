package org.example.mapas;// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class Solution {

    static Scanner in;

    public static boolean casoDePrueba() {

        int max = in.nextInt();

        if (max == 0)
            return false;
        else {

            HashMap<String,Integer> nums = new HashMap<>();
            in.nextLine();
            String[] numeros = in.nextLine().split(" ");

            for (String let : numeros) {

                //nums.put(let,nums.getOrDefault(let,0)+1);

                if (nums.containsKey(let)) {
                    nums.put(let, nums.get(let)+1);
                } else {
                    nums.put(let,1);
                }

            }


            String res = numeros[0];
            for (Map.Entry<String,Integer> let : nums.entrySet()) {
                if (nums.get(res) < let.getValue()) {
                    res = let.getKey();
                }
            }
            System.out.println(res);

            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main

} // class Solution
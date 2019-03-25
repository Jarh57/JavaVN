package Tema5.Ejercicio02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.print("Escribe un número entero positivo: ");
            int[] array = new int[Integer.parseInt(br.readLine())];
            if(array.length <= 170) {
                double factorial = 1;
                System.out.print("Elementos del array: [");
                for (int i = 0; i < array.length; i++) {
                    array[i] = i + 1;
                    if (i != array.length - 1) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                    }
                    factorial *= i + 1;
                }
                System.out.println("El factorial de 10 es " + factorial);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
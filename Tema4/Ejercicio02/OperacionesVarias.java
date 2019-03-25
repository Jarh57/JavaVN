package Tema4.Ejercicio02;

import java.io.*;
/**
 * OperacionesVarias
 */
public class OperacionesVarias {

    public static void main(String[] args) throws IOException{
        double total = 0;
        double totalPositivos = 0;
        double totalNegativos = 0;
        double numero = 0;
        int max = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            try {
                System.out.print("¿Cuántos números quieres sumar? ");
                max = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException nfe) {
                    System.out.println("Debes introducir un número");
                }
        }
        System.out.println("Teclea el primero y pulsa Enter, teclea el segundo y pulsa enter, etc");
        for (int i = 0; i < max; i++) {
                try {
                numero = Double.parseDouble(br.readLine());
                if(numero > 0) {
                    totalPositivos += numero;
                } else {
                    totalNegativos += numero;
                }
            } catch (NumberFormatException nfe) {
                i--;
                System.out.println("Solo se adminte números");
            }
        }
        total = totalPositivos + totalNegativos;
        System.out.println("Serie de números completada");
        System.out.println("Suma total = " + total);
        System.out.println("Suma de los positivos = " + totalPositivos);
        System.out.println("Suma de los negativos = " + totalNegativos);
    }
}
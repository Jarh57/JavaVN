package Tema3.Ejercicio06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * AdivinarNumero
 */
public class AdivinarNumero {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        boolean salida = false;
        String entrada;
        int numero = (int) (Math.random() * 100);
        int introducido;
        int contador = 0;
        System.out.println("--------------------------------------");
        System.out.println("Adivina un número entero entre 0 y 100");
        System.out.println("--------------------------------------");
        while (!salida) {
            System.out.println("Introduce un número o pulsa * para salir");
            entrada = br.readLine();
            introducido = Integer.parseInt(entrada);
            if(entrada.equals("*")){
                break;
            } 
            else if (numero > introducido){
                System.out.println("El número buscado es mayor");
            } else if(numero < introducido){
                System.out.println("El número buscado es menor");
            } else {
                System.out.println("HAS ACERTADO!! después de " + contador + " intentos");
                break;
            }
            contador++;
        }
    }
}
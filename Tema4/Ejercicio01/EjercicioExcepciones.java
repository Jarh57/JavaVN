package Tema4.Ejercicio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ejercicio01
 */
public class EjercicioExcepciones {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String leerInicio = "", leerFin = "";
        int inicio = 0, fin = 0;
        try {
            System.out.println("Introduce el comienzo del bucle: ");
            leerInicio = br.readLine();
            System.out.println("Introduce el final del bucle");
            leerFin = br.readLine();
            inicio = Integer.parseInt(leerInicio);
            fin = Integer.parseInt(leerFin);
            for (int i = inicio; i > fin; i--) {
                System.out.print(10/i + " ");
            }
        } catch (IOException io) {
            System.out.println("IOException: " + io.toString());
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.toString());
        } catch (ArithmeticException ae) {
            System.out.println("ArithmethicException: " + ae.toString());
        } finally {
            System.out.println("---------------------");
            System.out.println("Cerrando el buffer");
            System.out.println("---------------------");
            br.close();
        }
    }
    
}
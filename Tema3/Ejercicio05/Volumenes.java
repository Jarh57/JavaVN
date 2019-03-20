package Tema3.Ejercicio05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Volumenes
 */
public class Volumenes {
    double PI = Math.PI;
    double calculaVolumenCilindro(double altura, double radio){
        return PI * Math.pow(radio, 2) * altura;
    }

    double CalculaVolumenEsfera(double radio){
        return PI * Math.pow(radio, 3) * 4.0/3;
    }

    public static void main(String[] args) throws IOException {
        Volumenes volumen = new Volumenes();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Introduce la altura del cilindro: ");
        double altura = Double.parseDouble(br.readLine());
        System.out.print("Introduce el radio del cilindro: ");
        double cilindro = Double.parseDouble(br.readLine());
        System.out.print("Introduce el radio de la esfera: ");
        double esfera = Double.parseDouble(br.readLine());
        System.out.println("Volumen cilindro = " + volumen.calculaVolumenCilindro(altura, cilindro));
        System.out.println("Volumen esfera = " + volumen.CalculaVolumenEsfera(esfera));
    }
}
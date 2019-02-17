package Tema2.Ejercicio04;

public class SistemasNumeracion {
    public static void main (String args[]){
        int num=47;
        System.out.println("Número 47 en sistema decimal: " + num);
        System.out.println("Número 47 en hexadecimal: " + Integer.toHexString(num));
        System.out.println("Número 47 en octal: " + Integer.toOctalString(num));
        System.out.println("Número 47 en binario: " + Integer.toBinaryString(num));
    }
}
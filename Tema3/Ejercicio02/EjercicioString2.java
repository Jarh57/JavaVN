package Tema3.Ejercicio02;

/**
 * EjercicioString2
 */
public class EjercicioString2 {

    public static void main(String[] args) {
        String linea = "Esta es una frase de prueba para el ejercicio de contar letras";
        System.out.println("El número de veces que aparece el carácter 'a' en la cadena es: " + (linea.split("a").length -1));
    }
}
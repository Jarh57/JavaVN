package Tema3.Ejercicio01;

/**
 * EjercicioString1
 */
public class EjercicioString1 {

    public static void main(String[] args) {
        String linea = "En mi próxima vida, creere en la reencarnación";
        System.out.println("Longitud de la cadena: " + linea.length());
        System.out.println("Indice 7 asociado al carácter " + linea.charAt(7));
        System.out.println("La subcadena generada desde 20 hasta 26 excluido es " + linea.substring(20, 26));
        System.out.println("El índice del carácter x es " + linea.indexOf('x'));
        System.out.println("La cadena en mayúsculas es " + linea.toUpperCase());
        if (linea.startsWith("E")) {
            System.out.println("La String comienza por E");
        }
    }
}
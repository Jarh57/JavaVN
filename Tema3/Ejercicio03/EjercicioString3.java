package Tema3.Ejercicio03;

/**
 * EjercicioString3
 */
public class EjercicioString3 {

    public static void main(String[] args) {
        String linea = "Esta es una frase de prueba para el ejercicio de contar letras";
        int letraA = (linea.split("a").length -1);
        int letraO = (linea.split("o").length -1);
        int letraE = (linea.split("e").length -1);
        System.out.println("La letra a aparece: " + letraA + " veces");
        System.out.println("La letra o aparece: " + letraO + " veces");
        System.out.println("La letra e aparece: " + letraE + " veces");
        if(letraA > 5){
            System.out.println("Exceso de letra a");
        }
        if(letraO > 5){
            System.out.println("Exceso de letra o");
        }
        if(letraE > 5){
            System.out.println("Exceso de letra e");
        }
    }
}
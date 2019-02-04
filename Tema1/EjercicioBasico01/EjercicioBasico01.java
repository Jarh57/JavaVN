package Tema1.EjercicioBasico01;

/**
 * EjercicioBasico01
 */
public class EjercicioBasico01 {

    public static void main(String[] args) {
        CuadradoSuma suma = new CuadradoSuma();
        CuadradoDiferencia diferencia = new CuadradoDiferencia();
        Conclusion conclusion = new Conclusion();
        System.out.println(suma.calcularCuadradoSuma(3, 2));
        System.out.println(diferencia.calcularCuadradoDiferencia(3, 2));
        conclusion.mostrarConclusion();
    }
}
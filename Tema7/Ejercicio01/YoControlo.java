package Tema7.Ejercicio01;

import adr.cursojava.*;
import java.io.*;


public class YoControlo{
    int primerEle,ultimoEle;
    /*
     * Debe pedir por consola al usuario el primer y último elemento 
     * del array que va a generarse en la clase ArrayIndices. Si se 
     * introduce incorrectamente alguno de los números que van a ser 
     * primer y último elemento del array el programa mostrará un mensaje
     * de formato incorrecto y finalizará su ejecución 
     */
    void introducirEleInicialFinal() throws NumberFormatException, IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Primer elemento del array: ");
        primerEle = Integer.parseInt(br.readLine());
        System.out.print("Último elemento (mayor que el primero): ");
        ultimoEle = Integer.parseInt(br.readLine());
        
    }
    /* Mostrará por consola los elementos del array */
    void mostrarEleArray(int misEnteros[]){
        System.out.print("Los elementos del array son: [");
        for (int i = 0; i < misEnteros.length; i++) {
            if (i != misEnteros.length - 1) {
                System.out.print(misEnteros[i] + ", ");
            } else {
                System.out.println(misEnteros[i] + "]");
            }
        }
    }
    /*
     * Debe crear los objetos adecuados e invocar a los métodos
     * oportunos para que todo funcione correctamente. 
     * Mostrará por consola el producto y la suma de los elementos
     * del array y el cociente entre ambos.
     */
    public static void main(String args[]) throws NumberFormatException, IOException {
        YoControlo control = new YoControlo();
        control.introducirEleInicialFinal();
        ArrayIndices array = new ArrayIndices();
        array.crearArray(control.primerEle, control.ultimoEle);
        control.mostrarEleArray(array.enteros);
        System.out.println("Producto elementos del array = " + array.productoEleArray());
        System.out.println("Suma elementos del array = " + array.sumaEleArray());
        System.out.println("Cociente producto/suma = " + array.productoEleArray()/array.sumaEleArray());
    }
}
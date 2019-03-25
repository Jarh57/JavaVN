package Tema5.Ejercicio01;

import java.util.Arrays;

public class OrdenarArrayAleatorio{ 
        public static void main(String args[]){
          double[] array = new double[10];
          System.out.print("Elementos del array: [");
          for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 10000d) / 10000d;
            if (i != 9)
              System.out.print(array[i] + ", ");
            else
              System.out.println(array[i] + "]");
          }
          Arrays.sort(array);
          System.out.print("Elementos del array ordenados de menor a mayor: [");
          for (int i = 0; i < array.length; i++) {
            if (i != 9)
              System.out.print(array[i] + ", ");
            else
              System.out.println(array[i] + "]");
          }
          System.out.print("Elementos del array ordenados de mayor a menor: [");
          for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0)
              System.out.print(array[i] + ", ");
            else
              System.out.println(array[i] + "]");
          }
        }
      }
  
  
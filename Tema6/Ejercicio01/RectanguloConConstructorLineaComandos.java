package Tema6.Ejercicio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * RectanguloConConstructorLineaComandos
 */
public class RectanguloConConstructorLineaComandos{
    double x1,y1,x2,y2;
    
    //Constructor con cuatro argumentos.
    //Mismo nombre que la clase y no devuelve nada.
    //En este caso, inicializa las variables de instancia de los dos objetos
    //que se crean.
    RectanguloConConstructorLineaComandos(double x1,double y1,double x2,double y2){
        System.out.println("Inicio constructor");
        
        /*
         * Se emplea this para asignar el valor de los argumentos que le 
         * llegan al constructor a las variables de instancia siempre que
         * sus nombre coincidan, como ocurre aquí. Las variables precedidas
         * de this son de instancia, mientras que las otras son locales y
         * asociadas a los argumentos del constructor. Si los nombres, no
         * coincidieran no sería necesario emplear this.
         * this es MUY EMPLEADO PARA ESTA TAREA.
         */
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        System.out.println("Fin constructor");
    }
    double calculaArea(){
        
        //Uso de this para invocar a un método pasándole el objeto en curso
        mostrarEstado(this);
        return Math.abs((x2-x1)*(y2-y1));
    }
    void mostrarEstado(RectanguloConConstructorLineaComandos r){
        System.out.println("Estado:"+r.x1+", "+r.y1+", "+r.x2+", "+r.y2);
    }
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < 4; i++) {
            try {
                switch (i) {
                    case 0:
                        System.out.print("1er valor: ");
                        a = Double.parseDouble(br.readLine());
                        break;
                    case 1:
                        System.out.print("2do valor: ");
                        b = Double.parseDouble(br.readLine());
                        break;
                    case 2:
                        System.out.print("3er valor: ");
                        c = Double.parseDouble(br.readLine());
                        break;
                    case 3:
                        System.out.print("4to valor: ");
                        d = Double.parseDouble(br.readLine());
                        break;
                }
            } catch (IOException io) {
                i--;
                System.out.println("IOException: " + io.toString());
            } catch (NumberFormatException nfe) {
                i--;
                System.out.println("Solo se adminte números");
            }
        }
        br.close();
        //Llamada al constructor pasándole los parámetros que está esperando
        RectanguloConConstructorLineaComandos r=new RectanguloConConstructorLineaComandos(a, b, c, d);
        System.out.println("Area1="+r.calculaArea());
    }
}
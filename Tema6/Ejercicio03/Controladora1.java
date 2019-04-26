package Tema6.Ejercicio03;

class MiCompañero{
    String nombre="Charly";
    String tefCasa="941202225";
    String tefMovil="609253540";
    double factorial=1;
    void muestraTelefonos(){
        System.out.println("Nombre="+nombre);
        System.out.println("Telefono de casa="+tefCasa);
        System.out.println("Telefono movil="+tefMovil);
    }
    /* A este método se le debe pasar la variable de instancia tefCasaUltimo
     * de Calculos y debe devolver el factorial de ese entero.
     */
    double calculaFactorial(int numero){
        for(int i=1;i<=numero;i++)
            factorial*=i;
        return factorial;
    }
}
 
class Calculos extends MiCompañero{
    int edad=2;
    int tefCasaUltimo = Integer.parseInt(tefCasa.substring(super.tefCasa.length()-1)); // almacena la última cifra de tefCasa de MiCompañero
    void calculito(double fact){
        /*
         * El método mostrará por consola OK si el cociente
         * entre fact y edad es mayor de 15 y KO si es menor
         * o igual. Al método se le pasa el factorial obtenido en 
         * el método calculaFactorial
         */
        System.out.println("El factorial de la última cifra del teléfono de casa es " + fact);
        if (fact/edad > 15)
            System.out.println("OK");
        else
            System.out.println("KO");
        
    }
}
 
public class Controladora1{
    public static void main(String args[]){
        /*
         * Se encarga del control de la ejecución creando los objetos
         * adecuados y llamando a los métodos y variables pertinentes
         */
        Calculos calculos = new Calculos();
        calculos.muestraTelefonos();
        calculos.calculito(calculos.calculaFactorial(calculos.tefCasaUltimo));
    }
}
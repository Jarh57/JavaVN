package Tema2.Ejercicio02;

public class MetodosEstaticosEjercicio1{
    static String nombre="Carlos";
    static void dimeNombre(){
        String mote="cucu";
        System.out.println("Tu nombre es "+nombre+" y tu mote es "+mote);
    }
    static int mostrarEdad(int anNacimiento){
        return 2003-anNacimiento;
    }
    public static void main(String args[]){
        dimeNombre();
        System.out.println(nombre+" tiene "+mostrarEdad(1960)+" años");    
        System.out.println("FIN DEL PROGRAMA");
    }
}
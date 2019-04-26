package Tema6.Ejercicio02;

/**
 * Alumno
 */
public class Alumno {
    String nombre;
    String apellidos;
    int edad;
    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void mostrarNosotros() {
        System.out.println("Mi nombre es " + nombre + " " + apellidos);
        System.out.println("Tengo " + edad + " años");
    }
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Jesus", "Fernandez", 29);
        a1.mostrarNosotros();
        Alumno a2 = new Alumno("Pilar", "Lopez", 25);
        a2.mostrarNosotros();
        Alumno a3 = new Alumno("Carlos", "Gil", 31);
        a3.mostrarNosotros();
    }
}
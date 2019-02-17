package Tema2.Ejercicio01;
/**
 * ResolverEcuacionesSegundoGrado
 */
public class ResolverEcuacionesSegundoGrado {
 
    double a=1.5;
    double b=3.5;
    double c=1.5;
    double discriminante=Math.pow(b, 2)-4*a*c;
    double s1, s2;
    /* El método main se encargará de crear un objeto de la clase 
     * y llamar al método resolucion()
     */
    public static void main(String args[]){
        ResolverEcuacionesSegundoGrado res = new ResolverEcuacionesSegundoGrado();
        res.resolucion();
    }

    /* Este método se encargará de mostrar por consola las soluciones
     * de la ecuación y de llamar al método calculitos() cuando la 
     * ecuación tenga dos soluciones reales. Si la ecuación tiene una
     * sola solución real o soluciones complejas se mostrará un mensaje 
     * por consola indicándolo no se llamará al método calculitos()
     */
    void resolucion(){
        s1 = (-b + Math.sqrt(discriminante))/(2*a);
        s2 = (-b - Math.sqrt(discriminante))/(2*a);
        System.out.println("Las soluciones son: " + s1 +" y " + s2);
        if (s1 == 0 || s2 == 0) {
            System.out.println("No hay dos soluciones reales.");
            return;
        }
        calculitos(s1, s2);
    }

    /* Este método, mediante métodos estáticos de la clase Math, 
     * inicializará las variables locales solMenor y solMayor en base
     * a los argumentos num1 y num2.
     * Luego mostrará por consola:
     * 1) La solución mayor.
     * 2) La exponencial elevada a la solución mayor
     * 3) El coseno de la solución menor
     * 4) Las soluciones redondeadas hasta cuatro decimales
     * 5) El arcoseno de la solución mayor en radianes
     * 6) El arcoseno de la solución mayor en grados sexagesimales
     */
    void calculitos(double num1, double num2){
        double solMayor = num1;
        double solMenor = num2;
        System.out.println("Solución mayor: " + solMayor);
        System.out.println("La esponencial elevada a la solución mayor vale: " + Math.exp(solMayor));
        System.out.println("El coseno de la solucion menor vale: " + Math.cos(solMenor));
        System.out.println("Soluciones redondeadas hasta cuatro decimales: " + Math.round(solMayor * 1000d) / 1000d + " y " + Math.round(solMenor * 1000d) / 1000d);
        System.out.println("El arcoseno de la solución mayor en radianes: " + Math.asin(solMayor));
        System.out.println("El arcoseno de la solución mayor en grados sexagesimales: " + Math.toDegrees(Math.asin(solMayor)));
    }
}
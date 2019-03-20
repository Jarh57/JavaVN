package Tema3.Ejercicio04;

/**
 * ComprobarNif
 */
public class ComprobarNif {

    public static void main(String[] args) {
        ComprobarNif nifObj = new ComprobarNif();
        String nif = "16156159";
        nifObj.mostrarMensaje(nif, nifObj.comprobar(nif));
    }
    /*
     * Método que comprueba si un nif es válido o no. Condiciones que debo comprobar:
     * Longitud cadena = 9
     * Último carácter debe ser letra; el resto dígitos
     * @param nif El nif a comprobar
     * @return true si nif válido
     */
    public boolean comprobar(String nif){
        if (nif.length() == 9 && nif.substring(nif.length()-1).matches("[a-zA-Z]") && nif.substring(0, nif.length()-2).matches("-?\\d+(\\.\\d+)?")) {
            System.out.println(nif + " es un NIF válido");
            return true;
        }
        System.out.println(nif + " no es un NIF válido");
        return false;
    }
    
    /*
     * Muestra la parte numérica del nif y un mensaje indicando si es válido
     * @param nif El nif
     * @param nifValido Si es true, el nif es válido
     */
    public void mostrarMensaje(String nif,boolean nifValido){
        if (nifValido) {
            System.out.println("Parte numérica del NIF = " + nif.substring(0, 7));
        }
    }
}
package adr.cursojava;
 
public class ArrayIndices{
    public int enteros[];
    /*Este método va a recibir dos enteros que serán el primer y el 
     * último elemento del array que devuelve. 
     * El resto de elementos se obtendrán sumando
     * uno al primero hasta que se llegue al último.
     * Si el número asociado al argumento inferior es mayor que el 
     * asociado al argumento superior se mostrará por consola el 
     * mensaje "El último elemento debe ser mayor o igual que el primero.".
     * Después el programa finalizará su ejecución.
     */
    public int[] crearArray(int inferior,int superior){
        if (inferior > superior){
            System.out.println("El último elemento debe ser mayor o igual que el primero.");
            return null;
        }
        enteros = new int[superior - inferior + 1];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = inferior;
            inferior++;
        }
        return enteros;
    }
 
    /* Devuelve el producto de los elementos del array */
    public double productoEleArray() {
        double producto = 1;
        for (int i = 0; i < enteros.length; i++) {
            producto *= enteros[i];
        }
        return producto;
    }
    /*Devuelve la suma de los elementos del array */
    public double sumaEleArray(){
        double suma = 0;
        for (int i = 0; i < enteros.length; i++) {
            suma += enteros[i];
        }
        return suma;
    }
}
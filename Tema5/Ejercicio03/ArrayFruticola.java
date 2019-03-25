package Tema5.Ejercicio03;

public class ArrayFruticola{
    String frutas[] = new String[5];
    /*
     * Inicializa el array frutas con los siguientes nombres de frutas:
     * pera, limón, melocotón, nectarina y uva.
     * Además llama al método mostrarArrayInicial pasándo como parámetro un array que contiene el número de caracteres de
     * cada elemento del array frutas
     */
    void inicializarArray(){
        frutas[0] = "pera";
        frutas[1] = "limón";
        frutas[2] = "melocotón";
        frutas[3] = "nectarina";
        frutas[4] = "uva";
        mostrarArrayInicial(new int[]{frutas[0].length(), frutas[1].length(), frutas[2].length(), frutas[3].length(), frutas[4].length()});
    }
   
    /*
     * Muestra por consola los elementos del array frutas y el producto 
     * de los números de caracteres de sus elementos.
     */
    void mostrarArrayInicial(int frutasCaracteres[]){
        int totalCaracteres = 1;
        System.out.print("Elementos del primer array fruticola: [");
        for (int i = 0; i < frutas.length; i++) {
            if (i != frutas.length - 1) {
                System.out.print(frutas[i] + ", ");
            } else {
                System.out.println(frutas[i] + "]");
            }
            totalCaracteres *= frutasCaracteres[i];
        }
        System.out.println("Producto del número de carácteres = " + totalCaracteres);
    }
   
    /*
     * Crea un nuevo array basándose en el array frutas pero sin 
     * modificarlo, del siguiente modo:
     * Aquellas frutas que tengan más de 6 caracteres se cambiarán 
     * por la fruta melón. El resto seguirá sin cambios. 
     * El nuevo array se llamará frutillasNuevo y sus componentes serán: 
     * pera, limón, melón, melón y uva.
     */ 
    String[] crearNuevoArray() {
        String[] frutillasNuevo = new String[frutas.length];
        for (int i = 0; i < frutillasNuevo.length; i++) {
            if (frutas[i].length() > 6) {
                frutillasNuevo[i] = "melón";
            } else {
                frutillasNuevo[i] = frutas[i];
            }
        }
        return frutillasNuevo;
    }
   
    void mostrarNuevoArray(String frutasNuevo[]){
        System.out.print("Elementos del nuevo array fruticola: [");
        for (int i = 0; i < frutasNuevo.length; i++) {
            if (i != frutasNuevo.length - 1) {
                System.out.print(frutasNuevo[i] + ", ");
            } else {
                System.out.println(frutasNuevo[i] + "]");
            }
        }
    }
   
    /*
     * Se encargará del control de la ejecución.
     * En él se creará una instancia de la clase y se usará para realizar 
     * las llamadas a los métodos que permitirán:
     * 1) Inicializar el array frutas.
     * 1) Crear un nuevo array y mostrar sus datos por consola.
     * 3) Mensaje de FIN DE PROGRAMA.
     */
    public static void main(String args[]){
        ArrayFruticola fruticola = new ArrayFruticola();
        fruticola.inicializarArray();
        fruticola.mostrarNuevoArray(fruticola.crearNuevoArray());
        System.out.println("FIN DE PROGRAMA");
    }
  }
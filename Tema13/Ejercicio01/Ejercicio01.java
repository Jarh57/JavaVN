package Tema13.Ejercicio01;

import java.awt.*;
import java.awt.event.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * Ejercicio01
 */
public class Ejercicio01 extends Frame{
    Label label1,label2,label3,label4;
    Menu menu;
    MiCanvas mc;
    Button button;
    Choice choice;
    Checkbox check, checkbox1, checkbox2;
    CheckboxGroup checkgroup;
    List lista;
    TextArea textArea;
    TextField textField;
    Font miFuente;
    public static void main(String[] args) {
        Ejercicio01 ventana = new Ejercicio01();
        ventana.setBounds(100, 40, 750, 475);
        ventana.crearComponentes();
        ventana.setVisible(true);
    }
    
    void crearComponentes(){
        // miFuente=new Font("Serif",Font.BOLD,16);
        // this.setFont(miFuente);
 
        MenuBar barraMenus=new MenuBar();
        this.setMenuBar(barraMenus);

        menu = new Menu("Mi Menu");
        barraMenus.add(menu);
        MenuItem item1=new MenuItem("Menu 1");
        MenuItem item2=new MenuItem("Menu 2");
        MenuItem item3=new MenuItem("Menu 3");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        lista=new List(4,true);
        for(int i=1;i<11;i++){
            lista.add("OPCION "+i);
        }
        choice=new Choice();
        for(int i=0;i<6;i++){
            choice.add("ELEMENTO "+i);
        }
        
        check=new Checkbox();
        check.setLabel("Casilla Verificacion");

        Panel subPanel1 = new Panel();
        Panel subPanel2 = new Panel(new BorderLayout());
        Panel subPanel3 = new Panel();

        checkgroup = new CheckboxGroup();
        checkbox1 = new Checkbox("Curso Online",checkgroup,true);
        checkbox2 = new Checkbox("Curso Presencial",checkgroup,false);

        textArea = new TextArea(5,20);
        textArea.setText("AREA DE TEXTO");

        textField =new TextField();
        textField.setText("CUADRO TEXTO");


        label1=new Label();
        label1.setText("Selecciona el tipo de curso");
        label2=new Label();
        label2.setText("Escriba su opinión");
        label2.setBackground(Color.BLACK);
        label2.setForeground(Color.WHITE);
        label2.setBounds(1, 1, 15, 15);

        button = new Button("Mi Boton");

        Image imagen=getToolkit().getImage("imagen01.gif");
        setIconImage(imagen);

        mc=new MiCanvas(imagen);
        //Si el canvas no se agrega a un contenedor BorderLayout en su zona
        //central, debe asignársele anchura y altura. En caso contrario, no
        //se muestra.
        mc.setSize(150,150);
        mc.setBackground(Color.cyan);

        subPanel1.add(label1);
        subPanel1.add(checkbox1);
        subPanel1.add(checkbox2);
        subPanel1.setBackground(new Color(255, 173, 173));

        subPanel2.add(label2,BorderLayout.NORTH);
        subPanel2.add(textArea,BorderLayout.CENTER);

        subPanel3.add(textField);
        subPanel3.add(button);
        subPanel3.add(check);
        subPanel3.add(choice);
        subPanel3.setBackground(new Color(255, 173, 173));

        this.add(subPanel1, BorderLayout.NORTH);
        this.add(lista, BorderLayout.WEST);
        this.add(mc, BorderLayout.CENTER);
        this.add(subPanel2, BorderLayout.EAST);
        this.add(subPanel3, BorderLayout.SOUTH);
    }
}

class MiCanvas extends Canvas{
    Image imagen;
    public MiCanvas(Image imagen){
        this.imagen=imagen;
    }
    
    //Se redefine el paint(..)
    public void paint(Graphics g){
        
        //El segundo y tercer argumento son coordenadas respecto al canvas
        //Se muestra la imagen con sus diemnsiones reales
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        g.drawString("HOLA DESDE CANVAS", 120, 30);
        g.drawImage(imagen,50,50,this);
        
        //Si se desea mostrar la imagen con las dimensiones del canvas
        //g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
    }
}
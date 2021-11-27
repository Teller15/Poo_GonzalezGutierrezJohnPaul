/*

vamos a realizar un programa mediante el cual el usuario pueda gestionar
los pagos de los libros atrasados de la biblioteca.

*/


//librerias
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principal{

    int choice;
        String text_menu;
        
        
    
  
    public static void main(String[] args) {
        String text;
        int opciones=0;
        
           
    /*
    vamos a visualizar en una interfas pequeña las opciones del menú
        */
        //menu

        Principal mainp = new Principal();

        //ciclo para que el menu se repita y sea visible para el usuario 
        do{
            mainp.MenuP();
            text = JOptionPane.showInputDialog("en caso de que desida regresar al menu pricipal digite 1");
            opciones = Integer.parseInt(text); 

        
        }while(opciones == 1);

            
    }

    public void MenuP(){
        String text;
        int opciones=0;
        

        //los metodos void (vacios), son porque no reciben ningun parametro 

        //excepciones 
        try {
            text = JOptionPane.showInputDialog("Seleccione el programa a ejecutar de la siguiente lista:"
                 + "\n 1. Consultar el sueldo personal." 
                 + "\n 2. Costos y proveedores."
                 + "\n 3. Prestamo y devolucion de libros");
                 //cuando se utiliza JOptionpane solo se reciben cadenas
                 //voy a convertir esa cdena en un entero  
                 opciones = Integer.parseInt(text);
                 
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Para acceder a un programa solo se pueden ingresar numeros del 1 al 3 ");
            //vamos a obtener el error, es visible para el usuario
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
            //si solo queremos imprimir el error en consola
            System.out.println("El error es: "+e.getMessage());


        }


        switch (opciones) {
            case 1:
                //metodo
                break;

            case 2:
                Proveedores obj = new Proveedores();
                obj.MenuProveedores();
                //metodo
                break;
            
            case 3:
                //metodo
                break;
       
            default:
                JOptionPane.showMessageDialog(null, "vuelva pronto");
                break;
        }

            

        
    }




}

/*

suma de los costos de la biblioteca 
costo mayor
costo menor
costo promedio 
costo total


*/

import java.util.*;
import javax.swing.*;
import java.lang.Math;


public class Proveedores{

    private String nombre_clientes;
    private String producto[] = new String[10];
    private int costo[] = new int [10];
    private int producto_existente[] = new int [10];
    int opcion;

    //menu 
    public void MenuProveedores(){

        String text;
        //try catch para el manejo de errores
        
        Scanner sc = new Scanner(System.in);
        
        
        do{
            try{
                text = JOptionPane.showInputDialog("Seleccione la funcion deseada: "
                                                + "\n 1.- Suma total de costos"
                                                + "\n 2.- Costo Mayor"
                                                + "\n 3.- Costo Menor"
                                                + "\n 4.- Costo Promedio"
                                                + "\n 5.- Costo Total del Producto");
                                                opcion = Integer.parseInt(text);
    
    
            } catch (Exception e){
    
                JOptionPane.showMessageDialog(null, "Para acceder a un programa solo se pueden ingresar numeros del 1 al 5 ");
                //vamos a obtener el error, es visible para el usuario
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
                //si solo queremos imprimir el error en consola
                System.out.println("El error es: "+e.getMessage());
    
            }
                                     
            
            sc.nextInt();
    
            switch (opcion) {
                case 1:
                    SumaTotal();
                    break;
                case 2:
                    CostoMayor();
                    break;
                case 3:
                    CostoMenor();
                    break;
                case 4:
                    CostoPromedio();
                    break;
                   
                case 5:
                    CostoTotal();
                    break;
            
                default:
                    //un mensajito de gracias :3
                    break;
            }
    
        }while(opcion>5);
    
   
    }

    public void SumaTotal(){
        JOptionPane.showInputDialog("El costo de los libros es:");

    }

    public void CostoMayor(){
        JOptionPane.showInputDialog("el libro mas caro vale:");
    }

    public void CostoMenor(){
        JOptionPane.showInputDialog("El libro mas barato vale:");
    }

    public void CostoPromedio(){
        JOptionPane.showInputDialog("costo: 600 pejecoins");
    }

    public void CostoTotal(){
        JOptionPane.showInputDialog("pagar: ");

    }

    

}
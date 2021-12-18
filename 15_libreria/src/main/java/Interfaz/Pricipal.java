/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author User
 */

import Controles.ManipularLibros;
import java.io.*;
import java.util.*;

public class Pricipal {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //menu pricipal para poder manipular los datos del libro y 
        //de los demas documentos
        
        //instancia de Manipularlibros 
        ManipularLibros listadelibrosobj = new ManipularLibros();
        
        int opcion;
        
        do{
            System.out.println("Bienvenido a la biblioteca");
            System.out.println("Ingrese la opcion deseada ");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Consultar libro");
            System.out.println("3. Consultar todos los libros");
            System.out.println("Borrar un libro");
            System.out.println("5. modificar los datos de un libro");
            System.out.println("6. Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: 
                    //agregar libro
                    listadelibrosobj.agregarLibro();
                    
                    break;
                case 2:
                    //consultar libros por id
                    listadelibrosobj.buscar();
                    break;
                case 3: 
                    //consulta de todos los libros 
                    listadelibrosobj.consultaGeneral();
                    break;
                case 4:
                    //borrar
                    listadelibrosobj.borrar();
                    break;
                case 5:
                    listadelibrosobj.modificar();
                    break;
                case 6:
                    System.out.println("Adios, gracias por usar este programa");
                    //caundo vamos a generar el archivo
                    listadelibrosobj.grabar();
                default:
                    System.out.println("Error ingrese una opcion valida ");
                    
            }
        }while((opcion >= 1)&&(opcion < 6));
    }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Revista extends CLibro{
    
  //tipo de revista 
  private String tipo_revista;
  
  public Revista(){
      
} 

    public Revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }

    public Revista(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_revista = tipo_revista;
    }

    public String getTipo_revista() {
        return tipo_revista;
    }

    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    
    

//datos del tipo de revista
    
    public void agregarrevista(){
        //primero necesito jalar el metodo de aceptar datos y despues agregar
        //el tipo de revista 
        CLibro datoslibro = new CLibro();
        
        Scanner entrada = new Scanner(System.in);
        
        datoslibro.aceptardatos();
        System.out.println("Ingresa el tipo de revista");
        tipo_revista = entrada.nextLine();
        
        
        
    }
    
    

}

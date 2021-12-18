/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

/**
 *
 * @author User
 */

import java.io.*;
import java.util.*;

public class CLibro {
    
//las variables de un libro

private String nombre;
private String autor;
private String editorial;
private float precio;


public CLibro(){
       
}

    public CLibro(String nombre, String autor, String editorial, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
//metodo para agregar los datos del libro
    
    public void aceptardatos(){
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("ingresa el nombre del documento");
    nombre = entrada.nextLine();
    System.out.println("ingresa el nombre del autor");
    autor = entrada.nextLine();
    System.out.println("ingresa la editorial del documento");
    editorial = entrada.nextLine();
    System.out.println("ingresa el precio del documento");
    precio = entrada.nextFloat();
    
    }

    public void aceptarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

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
import java.util.*;

public class Periodico extends CLibro {
    
    //fecha de publicacion
    
    private Date fecha = new Date();
    private String fecha2;

    public Periodico(){
    this.fecha2 = fecha2;
    }     
    public Periodico(String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        
    }
     
    public void agregarPeriodico(){
        //primero necesito jalar el metodo de aceptar datos y despues agregar
        //el tipo de revista 
        CLibro datoslibro = new CLibro();
        
        
        Scanner entrada = new Scanner(System.in);
        
        datoslibro.aceptardatos();
        System.out.println("Ingresa la fecha de publicacion");
        fecha2 = entrada.nextLine();
      /*System.out.println("año: " + fecha.getYear());
        System.out.println("mes: " + fecha.getMonth());
        System.out.println("dia: " + fecha.getDay());
       */
    
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
}

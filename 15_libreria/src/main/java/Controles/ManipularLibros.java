/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

/**
 *
 * @author User
 */

import Documentos.CLibro;
import java.util.*;
import java.io.*;

public class ManipularLibros implements Serializable {

    //vamos a crear un metodo para agregar varios libros 

    //los objetos que son capaces de soportar diferentes tipos de dato 

    private ArrayList<CLibro> listadelibros;

    //un objeto para el archico de mis libros 

    private ArchivoL objetoarchivodelibros = new ArchivoL();    
    /*
    Esta clase u objeto se encargara de poder crear y leer
    los archivos del documento de libro 
    */    
    // vamos a hacer el crud de libros 
    // c de create, r de read, u de update, d de delete 

    public ManipularLibros(){
    //vamos a cargar la instancia de la lista de libros
    listadelibros = new ArrayList<CLibro>();
    //vamos a aplicar una sobrecarga al objeto para mandar
    //a llamar su lectura correspondiente del archivo creado
    listadelibros = objetoarchivodelibros.leer();
    
    }
    
    //crud  
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        //ciclo para solicitar datos de los libros 
        while (resp == 's'){
        //hago un objeto de CLibro y mando a llamar al metodo de los datos 
        CLibro objlibro = new CLibro();
        objlibro.aceptarDatos();
        //lo agrego al array
        listadelibros.add(objlibro);
        System.out.println("Desesa agregar otro libro?");
        resp = entrada.next().charAt(0);
        
        }
    } 

    //consultar un libro de forma genral
    public void consultaGeneral(){
        
        //si hay libros?
        //y si la lista esta vacía que hago?
        if(listadelibros.isEmpty()){
            System.out.println("No hay libros agregados");
        }else{
            //no esta vacia
            System.out.println("Los libros son: ");
            //recorrer la lista de los libros 
            for(int i = 0; i < listadelibros.size(); i++){
                //System.out.println("ID del Libro: " + listadelibros.get(i)
                System.out.println("Nombre del Libro: " + listadelibros.get(i).getNombre()+"\n");
                System.out.println("Autor del Libro: " + listadelibros.get(i).getAutor()+"\n");
                System.out.println("Editorial del Libro: " + listadelibros.get(i).getEditorial()+"\n");
                System.out.println("Precio del Libro: " + listadelibros.get(i).getPrecio()+"\n");
            }
        }
        
    }

    //vamos a realizar una busqueda por nombre 
    //Sangre y fuego de GOT
    private int traeposicion(String buscarnombre){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista de libros 
        for(int i = 0; i <listadelibros.size(); i++){
            if(buscarnombre.equalsIgnoreCase(listadelibros.get(i).getNombre())){
                //si lo encuentra
                pos = i;
                existe = true;
            }else{
                System.out.println("Libro no encontrado");
            }
        }
        
        if (!existe){
            //porque esta fuera de la lista del arreglo o la lista no existe 
            System.out.println("No existe registro del libro");
            pos = -1;
        }
        return pos;
    }


    //el metodo de la busqueda

//puedo buscar por nombre, editorial y precio 
    
    public int buscar (){
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del libro a buscar ");
        nombreBuscar = entrada.nextLine();
        
        posbuscar = traeposicion(nombreBuscar);
        
        //visualizo los datos
        
        System.out.println("Nombre del libro" + listadelibros.get(posbuscar).getNombre());
        System.out.println("Autor del libro" + listadelibros.get(posbuscar).getAutor());
        System.out.println("Editorial del libro" + listadelibros.get(posbuscar).getEditorial());        
        System.out.println("Precio del libro" + listadelibros.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
    
    
        public void borrar(){
        
            Scanner entrada = new Scanner(System.in);
            
            String libroborrar;
            int posborrar;
            
            //verificar que la lista de libros no este 
            
            if(listadelibros.isEmpty()){
                System.out.println("No hay libros registrados");              
            }else{
                System.out.println("ingresa el ID del libro que vas a eliminar: ");
                posborrar = buscar();
                
                if(posborrar < listadelibros.size()){
                    //
                    listadelibros.remove(posborrar);
                    System.out.println("Libro eliminado");
                }else{
                    //esta afuera del rango
                    System.out.println("imposible eliminar el registro");
                            
                }
            }
    
    }

    //modificar
    //autor, editorial, precio
    
    public void modificar(){
        int posmodificar = 0;
        int resmod = 0;
        String modificar;
        String opcion = "s";
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingresa el nombre del libro que deseas modificar: ");
        modificar = entrada.nextLine();
        
    
        while("s".equalsIgnoreCase(opcion)){
            posmodificar = traeposicion(modificar);
            
            //ya que obtuvo los datos 
            System.out.println("Que dato deseas modificar: "
                    + "\n 1.- Autor"
                    + "\n 1.- Editorial"
                    + "\n 1.- Presio"
                    + "\n");
            
            resmod = entrada.nextInt();
            
            switch(resmod){
                case 1: 
                    //autor
                    System.out.println("El autor es: ");
                    System.out.println("autor: " + listadelibros.get(posmodificar).getAutor() );
                    System.out.println("Ingresa el nuevo autor: ");
                    listadelibros.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El autor ha sido modificado");
                    System.out.println("Autor" + listadelibros.get(posmodificar).getAutor());
                    
                    break;
                
                case 2: 
                    //editorial
                    System.out.println("La editorial es: ");
                    System.out.println("Editorial: " + listadelibros.get(posmodificar).getEditorial() );
                    System.out.println("Ingresa la nueva editorial: ");
                    listadelibros.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El autor ha sido modificado");
                    System.out.println("Editorial" + listadelibros.get(posmodificar).getEditorial());
                    
                    break;
                    
                case 3:
                    //precio
                    System.out.println("El precio es: ");
                    System.out.println("precio: " + listadelibros.get(posmodificar).getPrecio() );
                    System.out.println("Ingresa el nuevo presio: ");
                    listadelibros.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El dato ha sido modificado");
                    System.out.println("Precio" + listadelibros.get(posmodificar).getPrecio());
                    
                    break;
                    
                    
                default:
                    System.out.println("Opcion no valida");
                     
            }
            System.out.println("Quieres cambiar algun tipo de dato s\n?");
            opcion = entrada.nextLine();
                
        }
    } 
    //para grabar el archivo
    //hacer el archivo para guardar la info de los libros 
    
    public void grabar(){
        //mando a llamar a que cree el archivo
        getObjetoarchivodelibros().serializar(listadelibros);
        
    }
    
    public ArrayList<CLibro> getListadelibros() {
        return listadelibros;
    }

    public void setListadelibros(ArrayList<CLibro> listadelibros) {
        this.listadelibros = listadelibros;
    }

    public ArchivoL getObjetoarchivodelibros() {
        return objetoarchivodelibros;
    }

    public void setObjetoarchivodelibros(ArchivoL objetoarchivodelibros) {
        this.objetoarchivodelibros = objetoarchivodelibros;
    }
        
        

}

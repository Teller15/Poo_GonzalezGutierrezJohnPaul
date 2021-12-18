/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._ventana;

/**
 *
 * @author User
 */
public class Registrarse extends ventana{
    private String nombre;
    private String apellidos;
    private String user;
    private String pass;
    /**
     * Constructor
     */
    public Registrarse(){
    
        nombre = "desconocido";
        apellidos = "desconocido";
        user = "desconocido";
        pass = "desconocido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
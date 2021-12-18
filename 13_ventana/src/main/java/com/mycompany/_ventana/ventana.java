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

import javax.swing.*;
import javax.swing.JPasswordField;
import java.lang.Object;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ventana implements ActionListener{
    String user;    
    String pass;
    
    public static void main (String[] args){
        
        /*
        Como se vio en la teoria es necesario primero crear el frame 
        */
      
        JFrame ventana = new JFrame ("ventana");
        
        //hay que definir a la ventana 
        ventana.setSize(350, 150);
        ventana.setBounds(550, 300, 400, 150);
        //definir la acciones de la venta 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito el panel para incorporar los componentes de la interfaz 
        JPanel panel = new JPanel();
        //en ese panel se agregan los componentes
        ventana.add(panel);
        
        //vamos a crear un metodo para agregar componentes
        agregarComponente(panel);
        
        ventana.setVisible(true);
        
    }

    private static void agregarComponente (JPanel panel) {
        //el panel se debe de inicializar
        panel.setLayout(null);//el panel esta vacio
        //agregamos los compnenetes como: 
        JLabel userlabel = new JLabel("Nombre de usuario");
        
        /*
        para inicializar los componentes se utiliza el metodo 
        
        set bounds 
        
        el cual utiliza 4 parametros para poder posicionar el
        componente dentro del panel 
        
        2 como coordenandas x,y
        2 para definir el tamaño 
        */
        
        
        userlabel.setBounds(10, 10, 120, 25);
        //lo agregamos al panel 
        panel.add(userlabel);
        
        //agregar campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(160, 10, 160, 25);
        panel.add(usertext);
      
       
        //etiqueta de pasword
        JLabel userpassword = new JLabel("Password");
        userpassword.setBounds(10, 40, 80, 25);
        panel.add(userpassword);    
        
        JPasswordField passtext = new JPasswordField(20);
        passtext.setBounds(160, 40, 160, 25);
        panel.add(passtext);    
        
        
        //dos botones 
        JButton loginbutton = new JButton("iniciar sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        loginbutton.addActionListener(this);
        
         
        JButton registrobutton = new JButton("Registrarse");
        registrobutton.setBounds(180, 80, 120, 25);
        panel.add(registrobutton);   
    }
        
        public void inicio (){
            if(user.equals("admin")&& pass.equals("123")){
                
            }else{
                
            }
        }
    
}


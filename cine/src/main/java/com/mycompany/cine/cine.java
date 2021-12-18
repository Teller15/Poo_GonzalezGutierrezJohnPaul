/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cine;

/**
 *
 * @author User
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
public class cine {
 
    public static void main(String[] args ) {
        // CUADRO DE BIENVENIDA
        JOptionPane.showMessageDialog(null,"Bienvenido ");
        // VARIABLE
	    double edad,monto;
	    double n;
	    char pago;
 
 
	    // VALORES DE PAGO DE ACUeRDO A  EDAD
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" Ingrese su edad ");
	    Scanner teclado = new Scanner(System.in);
	    edad=sc.nextFloat();
	    System.out.println(" Ingrese el modo de pago : \n [E] = Efectivo o [T] = Tarjeta ");
	    pago = teclado.next().charAt(0);
 
        switch (pago) {
            case 'E':
                if(edad >=55){
                    monto= (( 15 * 0.18) + 15) ;
                    System.out.println("el precio correspondiente (Adulto Mayores) es " + monto + " pesos "); }
 
                else if(edad < 55 && edad >= 18 ){
                    monto = ( 30 * 0.18) + 30  ;
                    System.out.println("el precio correspondiente (Adulto) es " + monto + " pesos ");}
 
                else if (edad >= 1 && edad < 12 ){
                    monto = ( 10 * 0.18) + 10 ;
                    System.out.println("el precio correspondiente (Menores de 12 años) es " + monto + " pesos ");}
 
                else if (edad >= 12 && edad <= 17 ){
                    monto = ( 20 * 0.18) + 20 ;
                    System.out.println("el precio correspondiente (De 13 para 17 años) es " + monto + " pesos ");}
                break;
 
            case 'T':
                if ( edad >=55){
                    monto = ( 15 * 0.035)* 0.18 + 15;
                    System.out.println("el precio correspondiente (Adulto Mayores) es " + monto + " pesos "); }
 
                else if (edad < 55 && edad >= 18 ){
                    monto = ( 30 * 0.035)* 0.18 + 30;
                    System.out.println("el precio correspondiente (Adulto) es " + monto + " pesos ");}
                else if (edad >= 1 && edad < 12 ){
                    monto = ( 10 * 0.035)*0.18 + 10 ;
                    System.out.println("el precio correspondiente (Menores de 12 años) es " + monto + " pesos ");}
                else if (edad >= 12 && edad <= 17 ){
                    monto = ( 20 * 0.035)*0.18 + 20 ;
                    System.out.println("el precio correspondiente (De 13 para 17 años) es " + monto + " pesos ");}
                default:
	    }
    }
}    



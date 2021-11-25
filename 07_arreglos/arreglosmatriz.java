
import java.util.*;

import javax.swing.DefaultBoundedRangeModel;


public class arreglosmatriz{

    public static void main(String[] args){
        /*
        Vamos a realizar un arreglo unidimensional
        y recorreclo para ver que hay dentro de cada elemento
        */
        //arreglo unidimensional
        //tipo de dato   nombre   tamanio
        //int arreglo[] = new int[10];

        //vamos a recorrerlo

        //for(int i = 0; i<arreglo.length; i++){
        //    System.out.println("Magia: " + arreglo[i]);
        //}

        //bidimensional

       
        
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        //vamos a sumar las filas del arreglo y sacar el promedio 

        float sumarFilas = 0;

        //filas
        //ingresar los valores a mi matriz
        for(int i = 0; i < matriz.length; i++){
            //System.out.println(i);
            //columnas
            for(int j = 0; j < matriz.length; j++){
                //System.out.println(j);
                //vamos a llenar la matriz
                System.out.println("Ingresa el valor de la fila: " 
                + i + " Ingresa el valor de la columna : " + j +" ");

                //vamos a ver la posicion
                matriz[i][j] = entrada.nextInt();

            }
        }


        //vamos a realizar la operacion de la suma y promedio
        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz.length; j++){
                sumarFilas += matriz[i][j];
                //sumarFilas = sumarFilas + matriz[i][j];
                System.out.println(String.format("%d", matriz[i][j]));
            }
            System.out.println(String.format("\n Suma de las filas %f, Promedio de la fila %.2f", sumarFilas, sumarFilas/matriz.length));
        }
    }

    /*
    Para el primero
    solo es un
    if(num > 0){
        positivo y lo guardo en un arreglo
    }else{
        negativo y lo guardo en otro arreglo
    }
    */ 
    
    Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0; //contadores de los números positivos y negativos
        int[] numeros = new int[10]; //array que contendrá los números leídos por teclado
        double sumaPos = 0, sumaNeg = 0; //acumuladores para las sumas de positivos y negativos                   
        
        public void menu(){
        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++){
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }

        //recorrer el array para sumar por separado los números positivos 
         // y los negativos 
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }

        //Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);                
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        
        }
        
        
        
    }   
    
    
    /*
 * Leer 10 números enteros y guardarlos en un array. 
 * Calcular la media de los números que estén en las posiciones pares.
 */



    public class Arrays1_2 {

        public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
            int i;
            int[] numeros = new int[10];
            double media = 0;

            //lectura de datos y llenar el array
            System.out.println("Lectura de los elementos del array: ");
            for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
            }
        
            //Recorrer el array y calcular la media
            for (i = 0; i < 10; i++) {
                if (i % 2 == 0){ //si la posición actual es par
                media = media + numeros[i]; //se suma el valor de esa posición
             }
            }
            //Calcular y mostrar la media
            System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);              
    }   }
    

    
        
    




}
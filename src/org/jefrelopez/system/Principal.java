/*
Nombre: Jefrey Eduardo López Ampérez
Código Técnico: IN5AM
Carné:2018422
Fecha de creación: 27-03-2022
Fecha de modificaciones: 28-03-2022
 */

package org.jefrelopez.system;

import java.util.Scanner;

public class Principal {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programador: Jefrey Eduardo López Ampérez");
        System.out.println("");
        
        /////////SUMA Y RESTA DE VECTORES:
        
        //Declaración de Vetores
        int[] vectorUno = new int[10];
        int[] vectorDos = new int [10];
        int[] vSuma = new int [10];
        int[] vResta = new int [10];
        
        System.out.println("Suma y Resta de vectores:");
        System.out.println("");
           
        //Pedir datos para cada posición del vector 1.
        System.out.println("Vector 1");
        for(int i=0; i<10; i++){
            System.out.println("Ingrese el valor para la posición " + i);
            vectorUno[i] = sc.nextInt();
        }
        
        //Pedir datos para cada posición del vector 2.
        System.out.println("");
        System.out.println("Vector 2 ");
           for(int i=0; i<10; i++){
            System.out.println("Ingrese el valor para la posición " + i);
            vectorDos[i] = sc.nextInt();
        }
           
        //SUMA de vector 1 y vector 2.
        System.out.println("");
        System.out.println("Suma de Vector 1 y Vector 2");
            for(int i=0; i<10;i++){
                vSuma [i] = vectorUno[i] + vectorDos[i];
                System.out.println(vectorUno[i]+ " + " +vectorDos[i]+  " = " + vSuma[i]);
        }
            
        // RESTA de vector 1 y vector 2.
        System.out.println("");
        System.out.println("Resta de Vector 1 y Vector 2");
            for(int i=0; i<10; i++){
                vResta [i] = vectorUno[i] - vectorDos[i];
                System.out.println(vectorUno[i]+ " - " +vectorDos[i]+  " = " + vResta[i]);
    
            }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        ///////// SUMA Y RESTA DE MATRICES:
        
        //Declaración de Matrices
        int[][] matrizUno = new int[3][3];
        int[][] matrizDos = new int[3][3];
        int[][] mSuma = new int[3][3];
        int[][] mResta = new int[3][3];
        
        System.out.println("Suma y Resta Matrices ");
        System.out.println("");
        
        // Pedir datos para cada posición de la matriz 1 
        System.out.println("Matriz 1");
        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Ingrese el valor para la posición [" +i+ "][" +j+ "]");
                matrizUno[i][j] = sc.nextInt();
            }
        }
            System.out.println("");
            
            // Pedir datos para cada posición de la matriz 2
            System.out.println("Matriz 2");
            for(int i =0; i<3; i++){
                for(int j=0; j<3; j++){
                    System.out.println("Ingrese el valor para la posicion [" +i+ "][" +j+ "]");
                    matrizDos[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            //SUMA de matriz 1 y matriz 2
            System.out.println("Suma de Matriz 1 y Matriz 2");
            for(int i=0;i<3;i++){
                for(int j=0; j<3;j++){
                    mSuma[i][j] = matrizUno[i][j] + matrizDos[i][j];
                    System.out.println(matrizUno[i][j] +" + "+ matrizDos[i][j] +" = "+ mSuma[i][j]);
                }
            }
            
            System.out.println("");
    
            //RESTA de matriz 1 y matriz 2
            System.out.println("Resta de Matriz 1 y Matriz 2");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    mResta[i][j] = matrizUno[i][j] - matrizDos[i][j];
                    System.out.println(matrizUno[i][j]+ " - "+ matrizDos[i][j]+" = "+ mResta[i][j]);
                }
            }
            
        
    }
    
}

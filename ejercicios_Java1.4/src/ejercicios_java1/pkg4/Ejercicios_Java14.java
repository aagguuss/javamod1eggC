/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java1.pkg4;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicios_Java14 {

    /** /*Ejercicio 10
*   Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
*   ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
*   5 *****
*   3 ***
*   11 ***********
*   2 **
    */
    
    public static void main(String[] args) {
       Scanner leer1= new Scanner(System.in) ;
       System.out.println("Ingrese 4 valores entre 1 y 20.");
        int memoria[]= new int[4];
        for (int i=0; i<4; i++){  
        memoria[i]= leer1.nextInt();
            while (memoria[i]<1 || memoria[i]>20){
                System.out.println("Ingrese valor entre 1 y 20.");
               memoria[i]= leer1.nextInt();
                }
             }
        System.out.print(memoria[0]);
           for (int j=0; j<memoria[0]; j++){      
               System.out.print("*");
           } 
             System.out.println("");
           System.out.print(memoria[1]);
         
              for (int j=0; j<memoria[1]; j++){      
               System.out.print("*");
           }
              System.out.println("");
              System.out.print(memoria[2]);
    
                for (int j=0; j<memoria[2]; j++){      
               System.out.print("*");
           } 
                 System.out.println("");
                System.out.print(memoria[3]);
                
                  for (int j=0; j<memoria[3]; j++){      
               System.out.print("*");
           }   
                System.out.println("");   
        
   
        
        
    }
    

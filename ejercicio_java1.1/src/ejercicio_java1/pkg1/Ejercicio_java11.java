/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java1.pkg1;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_java11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("ingrese un numero");
     int num1= leer.nextInt();
     System.out.println("ingrese un numero");
     int num2= leer.nextInt();
     System.out.println(num1+num2);
    }
    
}

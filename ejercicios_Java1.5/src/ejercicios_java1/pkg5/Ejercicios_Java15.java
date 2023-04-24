/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java1.pkg5;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicios_Java15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int numero= leer.nextByte();
      System.out.println(numero*2);
      System.out.println(numero*3);
      System.out.println(Math.sqrt(numero));
       
    }
    //Math.sqrt().                      
}

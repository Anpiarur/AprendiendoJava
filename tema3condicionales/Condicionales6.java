/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema3Condicionales;
import java.util.Scanner;
/**
 *Ejercicio 6
Realiza un programa que calcule el√tiempo que tardará en caer un objeto desde
siendo g = 9.81m/s2
una altura h. 
 * @author angelaruiz
 */
public
        class Condicionales6 {
  public static
          void main(String[] args) {
    
           final double g =9.81;
           System.out.println("Ingrese la altura");
           Scanner sc = new Scanner (System.in);
           double altura= sc.nextDouble();
           
           double resultado=Math.sqrt(2*altura/g);
           System.out.println("El resultado de la operación es: "+resultado);
  }
  
}

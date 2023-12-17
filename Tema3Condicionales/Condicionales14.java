/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema3Condicionales;
import java.util.Scanner;

/**
 *Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 * @author angelaruiz
 */
public
        class Condicionales14 {
  public static
          void main(String[] args) {
    
            Scanner sc=new Scanner (System.in);
            System.out.println("Introduczca un número entero");
            int numero=sc.nextInt();
            
            
          if (numero%2==0&&numero%5==0) {
            System.out.println("El número introducido es par y/o divisible entre cinco");
    }
          else{
            System.out.println("El número introducido no es par y/o divisible entre cinco");
          }
  }
  
}

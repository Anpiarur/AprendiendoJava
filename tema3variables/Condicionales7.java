/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema3Condicionales;
import java.util.Scanner;

/**
 *Ejercicio 7
  Realiza un programa que calcule la media de tres notas.
 * @author angelaruiz
 */
public
        class Condicionales7 {
  public static
          void main(String[] args) {
   Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese su primera nota");
    
    double nota1=sc.nextDouble();
    System.out.println("Ingrese su segunda nota");
    double nota2=sc.nextDouble();
    System.out.println("Ingrese su tercera nota");
    double nota3=sc.nextDouble();
    
    double media= (nota1+nota2+nota3)/3;
    
    System.out.println("La media de sus notas es: "+ media);
    
  }
}

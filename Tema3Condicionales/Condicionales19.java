/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema3Condicionales;

import java.util.Scanner;

/**
 * Ejercicio 19 Realiza un programa que nos diga cuántos dígitos tiene un número
 * entero que puede ser positivo o negativo. Se permiten números de hasta 5
 * dígitos.
 *
 * @author angelaruiz
 */
public
        class Condicionales19 {

  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese una cifra de máximo cinco dígitos");
    String numero = sc.nextLine();
    int cifra = numero.length();
    if (cifra <= 5) {
      System.out.println("Ha ingresado: " + cifra + " dígitos");
    }
    else {
      System.out.println("No ha ingresado los dígitos correctos");
    }

  }

}

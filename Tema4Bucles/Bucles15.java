/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema4Bucles;

import java.util.Scanner;

/**
 * Ejercicio 15 Escribe un programa que dados dos números, uno real (base) y un
 * entero positivo (exponente), saque por pantalla todas las potencias con base
 * el numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
 * 5, se deberán mostrar 2^1 , 2^2 , 2^3 , 2^4 y 2^5 .
 *
 * @author angelaruiz
 */
public
        class Bucles15 {

  public static
          void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("CALCULADORA DE POTENCIA");
    System.out.println("Ingrese la base de la potencia");
    int base = sc.nextInt();
    System.out.println("Ingrese el exponente de la potencia");
    int exponente = sc.nextInt();

    double resultado = 1;
    for (int i = 1; i <= exponente; i++) {
      resultado *= base;
      System.out.printf("La potencia de %d elevado a %d es %f\n", base, i, resultado);
    }
  }
}

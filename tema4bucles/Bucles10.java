/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema4Bucles;

import java.util.Scanner;

/**
 * Ejercicio 10 Escribe un programa que calcule la media de un conjunto de
 * números positivos introducidos por teclado. A priori, el programa no sabe
 * cuántos números se introducirán. El usuario indicará que ha terminado de
 * introducir los datos cuando meta un número negativo.
 *
 * @author angelaruiz
 */
public
        class Bucles10 {

  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int suma = 0;
    int contador = 0;

    System.out.println("Introduzca numeros positivos, en el momento que sea negativo el programa se detiene");

    while (numero >= 0) {

      numero = sc.nextInt();
      suma += numero;
      contador++;
    }
    System.out.print("La media de los números positivos introducidos es ");
    System.out.println((suma - numero) / (contador - 1));

  }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema4Bucles;

import java.util.Scanner;

/**
 *
 * @author angelaruiz
 */
public
        class Bucles23 {
   public static
          void main(String[] args) {
    int resultado = 10000;
    int suma = 0;
    int contador = 0;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.println("Ingrese un número");
      int numero = teclado.nextInt();

      suma += numero;
      contador++;

    }
    while (suma <= resultado);

    double media = suma / contador;
    System.out.println("Total acumulado = " + suma);
    System.out.println("Contador de números = " + contador);
    System.out.println("Media de números = " + media);
  
}
}

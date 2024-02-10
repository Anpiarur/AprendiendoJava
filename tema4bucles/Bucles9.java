/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema4Bucles;

import java.util.Scanner;

/**
 * Ejercicio 9 Realiza un programa que nos diga cuántos dígitos tiene un número
 * introducido por teclado. Este ejercicio es equivalente a otro realizado
 * anteriormente, con la salvedad de que el anterior estaba limitado a números
 * de 5 dígitos como máximo. En esta ocasión, hay que realizar el ejercicio
 * utilizando bucles; de esta manera, la única limitación en el número de
 * dígitos la establece el tipo de dato que se utilice (int o long).
 *
 * @author angelaruiz
 */
public
        class Bucles9 {

  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número");
    long numero = sc.nextLong();

    long total = numero;
    int digitos = 1;
    while (total > 10) {
      digitos++;
      total /= 10;
    }
    System.out.printf("El número introducido %d tiene %d digitos", numero, digitos);

  }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema4Bucles;

/**
 * Ejercicio 6 Muestra los números del 320 al 160, contando de 20 en 20
 * utilizando un bucle do-while.
 *
 * @author angelaruiz
 */
public
        class Bucles6 {

  public static
          void main(String[] args) {
    int numero = 320;
    do {
      System.out.println(numero);
      numero -= 20;
    }
    while (numero >= 160);
  }

}

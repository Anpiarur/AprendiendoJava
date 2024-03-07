package bucles;

import java.util.Scanner;

/**
 * Ejercicio 8 Muestra la tabla de multiplicar de un número introducido por
 * teclado.
 *
 * @author angelaruiz
 */
public class Bucles8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Tabla de multiplicar");
    System.out.println("Ingrese un número");
    int numero = sc.nextInt();
    sc.close();
    for (int i = 0; i <= 10; i++) {
      int resultado = numero * i;
      System.out.printf("%d x %d = %d%n", numero, i, resultado);

    }

  }

}

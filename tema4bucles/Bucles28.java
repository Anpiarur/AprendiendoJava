/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema4Bucles;
import java.util.Scanner;

/**
 * Ejercicio 28
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * Ejemplo:
 * Por favor, introduzca un número entero: 6
 * 6! = 720
 * 
 * @author angelaruiz
 */
public class Bucles28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero:");
        int numero = sc.nextInt();
        sc.close();

        // Inicializamos el factorial a 1
        long factorial = 1;

        // Calculamos el factorial usando un bucle
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.printf("%d! = %d\n", numero, factorial);
    }
}

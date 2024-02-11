package tema4bucles;

import java.util.Scanner;

/**
 * Ejercicio 37 Realiza un conversor del sistema decimal al sistema de
 * “palotes”. Ejemplo: Por favor, introduzca un número entero positivo: 47021 El
 * 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de
 * palotes.
 *
 * @author angelaruiz
 */
public class Bucles37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de sistema decimal al sistema de palotes");
        System.out.println("Introduzca un número entero positivo:");
        int numero = sc.nextInt();
        sc.close();

        if (numero < 0) {
            System.out.println("El número debe ser un entero no negativo.");
        } else {
            int temp = numero;
            int invertido = 0;

            // Manejo especial para el caso de 0
            String palote;
            if (temp == 0) {
                palote = "-";
            } else {
                palote = "|";
            }

            // Convertir el número a palotes
            while (temp > 0) {
                int digito = temp % 10;
                invertido = invertido * 10 + digito;
                temp /= 10;
            }

            // Imprimir palotes
            while (invertido > 0) {
                int digito2 = invertido % 10;
                for (int i = 0; i < digito2; i++) {
                    System.out.print("|");
                }
                if (invertido / 10 > 0) {
                    System.out.print("-");
                }
                invertido /= 10;
            }

            System.out.println("\nEs el " + numero + " pasado de sistema  decimal a sistema de palotes.");
        }
    }
}

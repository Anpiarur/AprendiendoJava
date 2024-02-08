/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Ejercicio 7 Escribe un programa que muestre tres apuestas de la quiniela en
 * tres columnas para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author angelaruiz
 */
public class Num7 {

    public static void main(String[] args) {

        int resultadoPartido;
        int columnas = 3;

        for (int fila = 1; fila <= 14; fila++) {
            System.out.printf("Partido %2d. |", fila);

            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
                resultadoPartido = (int) (Math.random() * 3) + 1;
                switch (resultadoPartido) {
                    case 1:
                        System.out.print(" 1 |");
                        break;
                    case 2:
                        System.out.print(" 2 |");
                        break;
                    case 3:
                        System.out.print(" X |");
                        break;

                }
            }
            System.out.println();
        }

        // Pleno al 15
        System.out.print("\nPLENO AL 15 - Local...");
        int goles = (int) (Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");

        System.out.print("   Visitante...");
        goles = (int) (Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");
    }
}

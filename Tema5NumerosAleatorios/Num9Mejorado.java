/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angelaruiz
 */
public class Num9Mejorado {

    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;

        while (numero != 24) {
            numero = (int) (Math.random() * 50) * 2; // Ajuste del rango para evitar esperas innecesarias
            if (numero == 24) {
                System.out.println(numero);
            } else {
                System.out.println(numero);
                contador++;
            }
        }
        System.out.println("Se han generado " + contador + " números");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema5NumerosAleatorios;

/**
 * Ejercicio 1 Escribe un programa que muestre la tirada de tres dados. Se debe
 * mostrar también la suma total (los puntos que suman entre los tres dados).
 *
 * @author angelaruiz
 */
public class Num1 {

    public static void main(String[] args) {

        //Declaracion de variables e inicialización
        int suma = 0;

        //Bucle para hacer la tirada de tres dados
        for (int i = 0; i < 3; i++) {
            int dado = (int) (Math.random() * 8 + 1);
            System.out.println("La tirada del dado es: " + dado);
            suma += dado;
        }

        //Resultado de la suma de los dados 
        System.out.println("La suma de de los tres dados es: " + suma);
    }
}
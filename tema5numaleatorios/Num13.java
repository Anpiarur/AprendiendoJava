/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Ejercicio 13 Escribe un programa que simule la tirada de dos dados. El
 * programa deberá continuar tirando los dados una y otra vez hasta que en
 * alguna tirada los dos dados tengan el mismo valor
 *
 * @author angelaruiz
 */
public class Num13 {

    public static void main(String[] args) {

        int dado1;
        int dado2;
        do {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            System.out.println("Tirada primer dado: " + dado1);
            System.out.println("Tirada segundo dado: " + dado2);
            
        } while (dado1 != dado2);
    }
}

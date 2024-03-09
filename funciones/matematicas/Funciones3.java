package funciones.matematicas;

import java.util.Scanner;

/*
Escribe un programa que pase de binario a decimal. */
public class Funciones3 {
    public static void main(String[] args) {

        // Declaración de variables
        int decimal = 0;

        // Pedimos el número binario por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número binario:");
        int binario = sc.nextInt();
        sc.close();

        // Ejecución con ayuda de las funciones matemáticas declaradas antes
        // Primero ver cuántos bits tiene el número introducido
        int cantidadBits = Digitos.contarDigitos(binario);

        // Conversión a decimal
        for (int i = 0; i < cantidadBits; i++) {
            int bit = Digitos.digitoEnPosicion(binario, cantidadBits - i - 1); //Para contar en el sentido correcto (i-1)
            decimal += bit * Potencia.potencia(2, i);
        }

        // Resultado
        System.out.println(binario + " en binario es " + decimal + " en decimal.");
    }
}
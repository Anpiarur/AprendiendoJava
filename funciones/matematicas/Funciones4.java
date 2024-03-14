

import java.util.Scanner;

/*
Escribe un programa que pase de decimal a binario. */
public class Funciones4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número decimal
        System.out.print("Introduzca un número en base diez para pasarlo a binario: ");
        int decimal = sc.nextInt();
        sc.close();

        // Mostrar el resultado de la conversión a binario
        System.out.println(decimal + " en decimal es " + decimalABinario(decimal) + " en binario.");
    }

    // Función para convertir un número decimal a binario
    public static int decimalABinario(int decimal) {
        if (decimal == 0) {
            return 0; // Si el número decimal es 0, el binario también es 0
        }

        int binario = 0; // Inicializar el número binario
        int potenciaDe10 = 0; // Inicializar la potencia de 10

        while (decimal > 0) {
            int digito = decimal % 2; // Obtener el último dígito binario
            binario = binario + digito * (int) Math.pow(10, potenciaDe10); // Agregar el dígito al número binario
            decimal = decimal / 2; // Actualizar el número decimal dividiéndolo por 2
            potenciaDe10++; // Incrementar la potencia de 10
        }

        return binario; // Devolver el resultado binario
    }
}
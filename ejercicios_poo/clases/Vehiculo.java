package ejercicios_poo.clases;
/*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra a
continuación: */

import java.util.Scanner;

public class Vehiculo {
    private static int vehiculosCreados;
    private static double kilometrosTotales;
    private double kilometrosRecorridos;
    private String color;
    private String modelo;
    private int year;

    public Vehiculo(String color, String modelo, int year) {
        this.color = color;
        this.modelo = modelo;
        this.year = year;
        vehiculosCreados++;
    }

    public void recorrer(double distancia) {
        kilometrosRecorridos += distancia;
        kilometrosTotales += distancia;
        System.out.println("Se han recorrido " + distancia + " kilómetros.");
    }

    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Kilómetros recorridos: " + kilometrosRecorridos);
    }

    public static void mostrarInfoGlobal() {
        System.out.println("Número total de vehículos creados: " + vehiculosCreados);
        System.out.println("Total de kilómetros recorridos por todos los vehículos: " + kilometrosTotales);
    }
}

class Bicicleta extends Vehiculo {
    Bicicleta(String color, String modelo, int year) {
        super(color, modelo, year);
    }

    public void hacerCaballito() {
        System.out.println("¡Haciendo caballito en la bicicleta!");
    }
}

class Coche extends Vehiculo {
    Coche(String color, String modelo, int year) {
        super(color, modelo, year);
    }

    public void acelerar() {
        System.out.println("¡Acelerando el coche!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta("Rojo", "Mountain Bike", 2020);
        Coche coche = new Coche("Negro", "SUV", 2022);

        int opcion;
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    bicicleta.andar();
                    break;
                case 2:
                    bicicleta.hacerCaballito();
                    break;
                case 3:
                    coche.andar();
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("Kilometraje de la bicicleta: " + bicicleta.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("Kilometraje del coche: " + coche.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("Kilometraje total de todos los vehículos: " + Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 8);

        Vehiculo.mostrarInfoGlobal();
    }
}
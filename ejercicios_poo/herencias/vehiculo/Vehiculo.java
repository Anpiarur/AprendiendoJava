package ejercicios_poo.herencias.vehiculo;

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
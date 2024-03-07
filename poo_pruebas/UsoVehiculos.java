package poo_pruebas;

public class UsoVehiculos {
    public static void main(String[] args) {
        //Creacion de primera instancia de clase Vehiculo
    Vehiculos miCoche = new Vehiculos(); //llamada al constructor
        miCoche.setColor(); //Cambiamos el color de "sin color" del constructor a "azul"
        System.out.println(miCoche.getColor());

    }
}

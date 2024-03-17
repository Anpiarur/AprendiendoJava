package ejercicios_poo.clases;

import java.util.Scanner;

public class UsoSucursalPaquete {
    public static void main(String[] args) {

        // Variables
        int sucursal, paquetes, referencia, prioridad = 0;
        String direccion, ciudad, dni;
        double peso;

        // Instancia clase Scanner
        Scanner sc = new Scanner(System.in);

        // Petición de datos
        System.out.println("Por favor, ingrese el número de sucursal: ");
        sucursal = sc.nextInt();

        sc.nextLine(); // Limpieza de buffer

        System.out.println("Ingrese la dirección: ");
        direccion = sc.nextLine();

        System.out.println("Ingrese la ciudad: ");
        ciudad = sc.nextLine();

        // Instancia de la clase sucursal
        Sucursal primera = new Sucursal(sucursal, direccion, ciudad);
        System.out.println("Ingrese el número de paquetes a realizar: ");
        paquetes = sc.nextInt();

        // Array para guardar los datos de los paquetes
        Paquete paquete[] = new Paquete[paquetes];

        for (int i = 0; i < paquetes; i++) {
            System.out.println("Ingrese la referencía del envio: ");
            referencia = sc.nextInt();
            System.out.println("Ingrese el DNI del remitenten: ");
            sc.nextLine();
            dni = sc.nextLine();
            System.out.println("Ingrese peso del paquete: ");
            peso = sc.nextDouble();
            // Boolean para ver si la prioridad es correcta
            boolean repetir = true;
            while (repetir) {
                System.out.println("Ingrese la prioriddad del envío (0=Normal,1=Alta,2=Urgente)");
                prioridad = sc.nextInt();
                if (prioridad == 1 || prioridad == 2 || prioridad == 3) {
                    repetir = false;
                } else {
                    System.out.println("Prioridad incorrecta, vuelva a introducirla.");
                }

            }
            // Instancia de la clase paquete
            paquete[i] = new Paquete(referencia, peso, dni, prioridad);
        }

        System.out.println("Los datos de la sucurusal son: ");
        System.out.println("Número de sucursal: " + primera.getNumeroSucursal());
        System.out.println("La dirección es: " + primera.getDireccion());
        System.out.println("La ciudad es: " + primera.getCiudad());
        System.out.println("Los datos de los paquetes son : ");
        for (int i = 0; i < paquetes; i++) {
            System.out.println("Paquete número: " + (i + 1));
            System.out.println("Precio: " + primera.precio(paquete[i]));
            System.out.println("Prioridad: " + paquete[i].getPrioridad());
            System.out.println("Peso: " + paquete[i].getPeso());

        }
sc.close();
    }
}


/*Ejercicio 1
Muestra los números primos que hay entre 1 y 1000. */
public class Funciones1 {
    public static void main(String[] args) {

        for(int i = 1; i < 1001; i++) {
          if (Primos.esPrimo(i)) {
            System.out.print(i + "  ");
          }
        }
      }
    }

/* Si la funcion no fuera estática habría que instanciar de la siguiente manera:
        funciones.matematicas.Primos primos = new funciones.matematicas.Primos();

        for (int i = 1; i < 1001; i++) {
            if (primos.esPrimo(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}
 */


public class Primos {
  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) { //Para reducir recursos se hace hasta la raiz cuadrada del numero
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}

public static int siguientePrimo(int numero) {
    int siguiente = numero + 1;
    while (!esPrimo(siguiente)) {
        siguiente++;
    }
    return siguiente;
}
}
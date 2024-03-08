package funciones.matematicas;

public class Digitos {

  
    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    public static int voltearNumero(int numero) {
        int resultado = 0;
        while (numero != 0) {
            resultado = resultado * 10 + numero % 10;
            numero /= 10;
        }
        return resultado;
    }

    public static int digitoEnPosicion(int numero, int posicion) {
        int divisor = (int) Math.pow(10, posicion);
        return (numero / divisor) % 10;
    }

    public static int posicionDeDigito(int numero, int digito) {
        int posicion = 0;
        while (numero != 0) {
            if (numero % 10 == digito) {
                return posicion;
            }
            numero /= 10;
            posicion++;
        }
        return -1; /*Esta convención es comúnmente utilizada para indicar "no encontrado" 
        o "error" en muchos lenguajes de programación. */
    }

    public static int quitarDigitosPorDetras(int numero, int cantidad) {
        return numero / (int) Math.pow(10, cantidad);
    }

    public static int quitarDigitosPorDelante(int numero, int cantidad) {
        int longitud = contarDigitos(numero);
        return numero % (int) Math.pow(10, longitud - cantidad);
    }

    public static int anadirDigitoPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    public static int anadirDigitoPorDelante(int numero, int digito) {
        int longitud = contarDigitos(numero);
        return digito * (int) Math.pow(10, longitud) + numero;
    }

    public static int trozoDeNumero(int numero, int inicio, int fin) {
        int longitud = contarDigitos(numero);
        int divisor = (int) Math.pow(10, longitud - fin - 1);
        return (numero / divisor) % (int) Math.pow(10, fin - inicio + 1);
    }

    public static int juntarNumeros(int numero1, int numero2) {
        int longitudNumero2 = contarDigitos(numero2);
        return numero1 * (int) Math.pow(10, longitudNumero2) + numero2;
    }
}
package tema6arrays.bidimensional;

/*
 * Ejercicio 9
Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados.
 */
public class Arraybi9 {
    public static void main(String[] args) {

        // Primera matriz
        int original[][] = new int[12][12];

        // Rellenar primera matriz e impresion
        System.out.println("La matriz original es la siguiente");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = (int) (Math.random() * 101);
                System.out.printf("%5d ", original[i][j]);
            }
            System.out.println();
        }
        // Segunda matriz
        int girado[][] = new int[12][12];

        // Rotación de la matriz
        System.out.println("\nLa matriz girada es la siguiente: ");
        for (int capa = 0; capa < 6; capa++) {

            // Rotación por arriba
            int aux1 = original[capa][11 - capa];
            for (int i = 11 - capa; i > capa; i--) {
                original[capa][i] = original[capa][i - 1];
            }

            // Rotación por la derecha
            int aux2 = original[11 - capa][11 - capa];
            for (int i = 11 - capa; i > capa + 1; i--) {
                original[i][11 - capa] = original[i - 1][11 - capa];
            }
            original[capa + 1][11 - capa] = aux1;

            // Rotación por abajo
            aux1 = original[11 - capa][capa];
            for (int i = capa; i < 11 - capa - 1; i++) {
                original[11 - capa][i] = original[11 - capa][i + 1];
            }
            original[11 - capa][11 - capa - 1] = aux2;

            // Rotación por la izquierda
            for (int i = capa; i < 11 - capa - 1; i++) {
                original[i][capa] = original[i + 1][capa];
            }
            original[11 - capa - 1][capa] = aux1;
        }

        // Imprimir el resultado
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.printf("%5d ", original[i][j]);
            }
            System.out.println();
        }
    }
}
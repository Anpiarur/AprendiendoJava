
/*Muestra los números capicúa que hay entre 1 y 99999. */
public class Funciones2 {
    public static void main(String[] args) {
        for (int i = 1; i <100000 ; i++) {
            if (Digitos.esCapicua(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}
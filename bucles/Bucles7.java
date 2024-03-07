package bucles;

import java.util.Scanner;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
 * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author angelaruiz
 */
public class Bucles7 {

  public static void main(String[] args) {

    int correcta = 1234;
    int contador = 0;
    int password = 0;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Ingrese la contraseña (número de cuatro cifras)");
      password = sc.nextInt();
      if (password == correcta) {
        System.out.println("La caja fuerte se ha abierto sastisfactoriamente");
      }

      else {
        System.out.println("Lo siento, esa no es la combinación");
        contador++;
      }
    } while ((password != correcta) && contador < 4);
    sc.close();
  }

}

package ejercicios_poo.herencias.animal;

public class UsoAnimal {
    public static void main(String[] args) {
        // Crear instancias de la clase Gato con diferentes parámetros
        Gato garfield = new Gato(Sexo.MACHO, "romano");
        Gato tom = new Gato(Sexo.MACHO);
        Gato lisa = new Gato(Sexo.HEMBRA);
        Gato silvestre = new Gato();

        // Imprimir información de cada gato
        System.out.println(garfield);
        System.out.println(tom);
        System.out.println(lisa);
        System.out.println(silvestre);

        // Crear instancia de la clase Ave y llamar a sus métodos
        Ave miLoro = new Ave();
        miLoro.aseate(); // Limpia al loro
        miLoro.vuela(); // Hace volar al loro

        // Crear instancia de la clase Pinguino y llamar a sus métodos
        Pinguino pingu = new Pinguino(Sexo.HEMBRA);
        pingu.aseate(); // Limpia al pingüino
        pingu.vuela(); // Indica que el pingüino no puede volar
    }
}

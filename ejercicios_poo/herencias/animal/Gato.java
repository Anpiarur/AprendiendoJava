package ejercicios_poo.herencias.animal;

public class Gato extends Animal {
    private String raza;

    // Constructor que recibe sexo y raza del gato
    public Gato(Sexo s, String r) {
        super(s); // Llama al constructor de la clase base (Animal) con el sexo proporcionado
        raza = r; // Asigna la raza del gato
    }

    // Constructor que recibe solo sexo y establece una raza predeterminada
    public Gato(Sexo s) {
        super(s); // Llama al constructor de la clase base (Animal) con el sexo proporcionado
        raza = "siamés"; // Establece la raza predeterminada
    }

    // Constructor que recibe solo la raza y establece un sexo predeterminado
    public Gato(String r) {
        super(Sexo.HEMBRA); // Llama al constructor de la clase base (Animal) con un sexo predeterminado
        raza = r; // Asigna la raza del gato
    }

    // Constructor sin parámetros que establece tanto el sexo como la raza
    // predeterminada
    public Gato() {
        super(Sexo.HEMBRA); // Llama al constructor de la clase base (Animal) con un sexo predeterminado
        raza = "siamés"; // Establece la raza predeterminada
    }

    // Método toString() para obtener una representación de cadena del gato
    public String toString() {
        return super.toString() // Llama al método toString() de la clase base (Animal)
                + "Raza: " + this.raza + "\n*************************\n"; // Agrega información de la raza del gato
    }

    // Método que hace que el gato maulle
    public void maulla() {
        System.out.println("Miauuuu");
    }

    // Método que hace que el gato ronronee
    public void ronronea() {
        System.out.println("mrrrrrr");
    }

    // Método que hace que el gato coma
    public void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    // Método que hace que el gato pelee con otro gato
    public void peleaCon(Gato contrincante) {
        // Verifica si este gato es hembra
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("no me gusta pelear");
        } else { // Si no es hembra, verifica el sexo del contrincante
            if (contrincante.getSexo() == Sexo.HEMBRA) {
                System.out.println("no peleo contra gatitas");
            } else { // Si ambos son machos, indica que van a pelear
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }
}
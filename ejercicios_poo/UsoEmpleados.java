package ejercicios_poo;

public class UsoEmpleados {
    public static void main(String[] args) {

        // Primera instancia de Empleados
        Empleados uno = new Empleados("Ana");

        System.out.println(uno.getDatosEmpleado());

        uno.setSeccion("Recursos humanos");

        System.out.println(uno.getDatosEmpleado());

        //Segunda instancia de Empleados
        Empleados dos = new Empleados("Antonio");

        System.out.println(dos.getDatosEmpleado());

        //Tercera instancia de Empleados
        Empleados tres= new Empleados("María");
        System.out.println(tres.getDatosEmpleado());

        //Cuarta instancia de empleados
        Empleados empleadoAzar = new Empleados("Jorge");
        System.out.println(empleadoAzar.getDatosEmpleado());

    }
}

class Empleados {
    // CONSTRUCTOR
    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion = "Administración";
        id=idSiguiente;
        idSiguiente++;
    }
    // COMPORTAMIENTOS
    // METODO SETTER

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    // METODO GETTER
    public String getDatosEmpleado() {
        return "El empleado " + nombre + " pertenece a la sección de " + seccion+" y su ID es "+id;
    }

    // CAMPOS DE CLASE (PROPIEDADES)
    private final String nombre; //Constante (no tiene sentido poder cambiar el nombre durante la ejecucion del programa)
    private String seccion;
    private int id;
    private static int idSiguiente=1; //Al ser static no pertenece a ninguna instancia de clase, ni se puede copiar, solo pertenece a la
    //clase Empleados.
}

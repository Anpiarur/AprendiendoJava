package ejercicios_poo.clases;

public class Alumno {

    //Constructor
    public Alumno (String nombre,double notaMedia){
        this.nombre=nombre;
        this.notaMedia=notaMedia;
        numero+=numero;
        numero++;
    }

    public String getDatosAlumno(){
        return "El alumno "+nombre+" con número "+numero+ " tiene una nota media de "+notaMedia;
    }


    private String nombre;
    private double notaMedia;
    private static int numero;

}

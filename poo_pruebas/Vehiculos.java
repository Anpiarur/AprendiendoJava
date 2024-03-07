package poo_pruebas;

public class Vehiculos {
    public Vehiculos (){ //Constructor de la clase. Mismo nombre que la clase
        ruedas=4;
        largo=2;
        ancho=1;
        peso=2;
        color="sin color";
    }

    public void setColor(String colorVehiculo){ //Por convención en Java a los metodos setter se les llama set+propiedad a cambiar
    //String colorVehiculo es pasar parametros al metodo
    
    color=colorVehiculo;
    /*El metodo setter establece el valor de la propiedad
        color="azul";*/
    }
    public String getColor(){ //nombrado igualmente por convención, metodo getter.
     //El metodo getter devuelve el valor de la propiedad
        return color;
    }
    private int ruedas; //private solo se puede usar desde esta clase
    private String color;
    private int largo;
    private int ancho;
    private int peso;
}

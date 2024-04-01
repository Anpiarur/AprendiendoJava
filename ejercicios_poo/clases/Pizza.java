package ejercicios_poo.clases;

public class Pizza {
private String tipo;
private String tamaño;
private static int pedidas=0;
private static int servidas = 0;
private static int pendientesServir;

public Pizza (String tipo, String tamaño){
    this.tipo=tipo;
    this.tamaño=tamaño;
    pedidas++;
}



public  static void sirve(){
    if (pedidas > 0) {
        pendientesServir=pedidas;
        servidas++; 
        pendientesServir--;} 
    }

    public static String getTotalPedidas() {
            return "Las pizzas pedidas son :"+pedidas;
    }

    public static String getPizzeriaPedidos(){
        return "Las pizzas pedidas en total son "+ pedidas+
        "Las pizzas pendientes de servir son "+ pendientesServir+
        "Las pizzas ya servidas son "+servidas;
    }

    public static String getTotalServidas() {
        return "Las pizzas servidas son :"+servidas;
    }
}

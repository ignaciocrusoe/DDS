
import java.sql.Date;

public class Item{
    private String producto;
    private String carrito;
    private int cantidad;
    private int precio;
    private int fecha;

    public static void main(String[] args) {
        //Tarjeta tarjeta = new Tarjeta();
    }

    public int precio(){
        return precio;
    }

    public int precioTotal(){
        return precio * cantidad;
    }

    public void setCantidad(int newCantidad){
        cantidad = newCantidad;
    }

    public void agregarACarrito(String newCarrito){
        carrito = newCarrito;
    }
}

public class Main{
    public void main(String[] args){
        Item item = new Item();
    }
}
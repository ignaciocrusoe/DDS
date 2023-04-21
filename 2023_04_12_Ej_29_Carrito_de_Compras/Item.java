import java.sql.Date;

public class Item{
    private Producto producto;
    private Carrito carrito;
    private int cantidad;
    private int precio;
    private Date fecha;

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

    public void agregarACarrito(int newCarrito){
        carrito = newCarrito;
    }
}


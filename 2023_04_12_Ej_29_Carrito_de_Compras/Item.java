import java.sql.Date;

public class Item{
    private Producto producto;
    private Carrito carrito;
    private Integer cantidad;
    public Integer precioTotal;
    private Date fecha;

    public static void main(String[] args) {}

    public Integer precio(){
        return precioTotal;
    }    
}
import java.sql.Date;

public class Item{
    private Producto producto;
    private Carrito carrito;
    private Integer cantidad;
    private Integer precio;
    private Date fecha;

    public static void main(String[] args) {}

    public Integer precio(){
        return precio;
    }    
}
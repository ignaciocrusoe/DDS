package paquete;
import java.util.ArrayList;
import java.util.List;


public class Carrito{
    private List<Item> items = new ArrayList<Item>();
    private Persona persona;
    private Integer totalAPagar = 0;
    private Estado estado = Estado.ABIERTO;

    //carrito abierto para agregar o sacar items
    //carrito cerrado listo para pagar
    //carrito pagado
    public enum Estado{ABIERTO, CERRADO, PAGADO}

    public void finalizarCompra(){
        estado = Estado.CERRADO;
        this.totalAPagar = items.stream().mapToInt(i->i.precio).sum();
    }

    public void agregarItem(Item item){
        this.items.add(item);
    }

    public void quitarDeCarrito(Item item){
        this.items.remove(item);
    }
    
    public void pagarCarrito(){
        this.estado = Estado.PAGADO;
    }

    public static void main(String[] args){ System.out.println("hello world");}

}
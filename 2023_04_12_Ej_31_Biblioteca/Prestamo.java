import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;



public class Prestamo{
    private Boolean devuelto = false;
    private Boolean vencido = false;
    private Copia copiaPrestada;
    //private Persona persona;
    private LocalDateTime  fechaPrestamo;
    private LocalDateTime  fechaDeDevolucion;
    private LocalDateTime fechaVencimiento;

    public Prestamo(Copia copia){
        this.copiaPrestada = copia;
        this.fechaPrestamo = LocalDateTime.now();
        this.fechaVencimiento = this.fechaPrestamo.plusDays(30);

        
    }

    public void recibirDevolucion(){
        this.fechaDeDevolucion = LocalDateTime.now();
        this.verificarPrestamo();
        this.devuelto = true;
    }

    public void verificarPrestamo(){
        if(this.fechaDeDevolucion.isAfter(this.fechaVencimiento)){
            this.vencido = true;
        }
    }

    public Integer calcularDiasDeMulta(){
        Long diasAtrasados = this.fechaVencimiento.until(this.fechaDeDevolucion, ChronoUnit.DAYS);

        Integer diasMulta = (int) (long) Math.max(0, diasAtrasados)*2;

        return diasMulta;
    }

    public static void main(String[] args){
        System.out.println(LocalDateTime.now());
    }
}
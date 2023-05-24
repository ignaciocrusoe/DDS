import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;

public class Prestamo{
    private Boolean devuelto = false;
    private Boolean vencido = false;
    //private Copia copiaPrestada;
    //private Persona persona;
    private LocalDateTime  fechaPrestamo;
    private LocalDateTime  fechaDeDevolucion;
    private LocalDateTime fechaVencimiento;
    private Integer diasMultado;

    public Prestamo(/*Copia copiaPrestada*/){
        //this.copiaPrestada = copiaPrestada;
        this.fechaPrestamo = LocalDateTime.now();
    }

    public void recibirDevolucion(){
        this.fechaDeDevolucion = LocalDateTime.now();
        this.verificarPrestamo()
        this.diasMultado = this.calcularDiasDeMulta();
        //multa.sumarMultas();  <-- Agregar después de implementar la clase Multa
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
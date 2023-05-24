public class Multa {
    private Integer diasMultado;

    private Prestamo prestamoGenerador;

    private LocalDateTime fechaFinMulta;

    private Persona multado;

    public Multa(Prestamo prestamo){
        this.prestamoGenerador = prestamo;

        this.diasMultado = prestamo.calcularDiasDeMulta();

        this.fechaFinMulta = prestamoGenerador.fechaDeDevolucion.plusDays(diasMultado);

    }
    public void sumarMultas(Integer diasMultado){
        this.diasMultado += diasMultado;
    }
}

public class Tarjeta{

    private String nombre;

    private Integer numero; 

    private Date fecha;

    private String codigo;

    private Boolean verificada;

    private Persona cliente;

    public Tarjeta(String nombre, Integer numero, Date fecha, String codigo, Boolean verificada, Persona cliente) {

        this.nombre = nombre;
        this.numero = numero;
        this.fecha = fecha; 
        this.codigo = codigo;
        this.verificada = verificada;
        this.cliente = cliente;
		
	}

	public static void main(String[] args) {

		
	}
	
}
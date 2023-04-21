import java.time.LocalDate;
import java.util.*;

/**
 * @author ernes
 *
 */
public class Persona {
		
	
	private String nombre; 
	private LocalDate fechaDeNacimiento;
	private Integer dni;
	private Boolean habilitado = true;
	
	private List<Prestamo> listaDePrestamosHistoricos = new ArrayList<Prestamo>();
	private List<Prestamo> listaDePrestamosVigentes = new ArrayList<Prestamo>();
	private List<Multa> listaDeMultasHistoricas = new ArrayList<Multa>();
	private Multa multaVigente = null; 
	

	
/*============================================INTERFAZ===================================================*/	
	public Persona(String nombre, LocalDate fechaNacimiento, Integer dni) {
		this.nombre = nombre;
		this.fechaDeNacimiento=fechaNacimiento;
		this.dni = dni;
		
	}
	

	/**
	 * @param args
	 */
	public void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void pedirPrestamo(Libro libroPedido, LocalDate fechaPedidoPrestamo ) throws Exception {
		
		
		Prestamo prestamoPedido = new Prestamo(libroPedido,fechaPedidoPrestamo, this);
		
		//si todo ok 
		
		listaDePrestamosVigentes.add(prestamoPedido);
		
 }//PODRIA DEVOLVER UN ID_PRESTAMO PARA QUE DESPUES SEA MÁS FACIL IDENTIFICAR EL PRESTAMO QUE SE QUIERE DEVOLVER

	public void devolverPrestamo(Integer indiceListaPrestamos, LocalDate fechaDeDevolucion) throws Exception {
	
	
		Prestamo prestamo = listaDePrestamosVigentes.get(indiceListaPrestamos);
		
		prestamo.recibirDevolucion();
		listaDePrestamosVigentes.remove(prestamo);
		listaDePrestamosHistoricos.add(prestamo);
			
			if(prestamo.calcularDiasDeMulta()!=0) {
				this.serMultado(prestamo);
			}
	
	}

	public Boolean estaHabilitado() throws Exception {
		this.controlHabilitacion();
		return habilitado;
	}
	
	public Prestamo seleccionarPrestamo (Integer indiceLista) { //por ahora lo manejo con índice
		
	 return listaDePrestamosVigentes.get(indiceLista);
		
	}
	
/*=======================================================================================================*/	

/*============================================PRIVADOS===================================================*/	


	private void controlHabilitacion() throws Exception {
		 
		if(	this.alcanzoElLimiteDeLibrosEnPrestamo() ||
				
				this.tienePrestamosVencidos() ||
					
						this.tieneMultaVigente() ) {
			
			habilitado=false;
			
		}else {
			
			habilitado=true;
		}
		
	}
	
	private Boolean alcanzoElLimiteDeLibrosEnPrestamo() {
		
	 return listaDePrestamosVigentes.size() == 3;
				
	}
	private Boolean tienePrestamosVencidos() {
	
		if(listaDePrestamosVigentes.size()>0) {
			
			for(Prestamo prestamo : listaDePrestamosVigentes) {
				if(prestamo.estaVencido()) {
					return true;
				}
			}
			
		}
	
		return false;
		
	}
	private Boolean tieneMultaVigente() throws Exception {
		
		if(multaVigente == null) {
			
			return false;
			
		}if(! multaVigente.estaVigente()) {
			
			listaDeMultasHistoricas.add(multaVigente);
			multaVigente = null;
			
			return false;
			
			
		}if(multaVigente.estaVigente()) {
		 
		    return true;
		}
		
		throw new Exception("no se pudo analizar la vigencia de la multa");
	}
	

	private void serMultado(Prestamo prestamo) {
		
		 if(multaVigente!=null) {listaDeMultasHistoricas.add(multaVigente);}
		 
		 multaVigente = new Multa(prestamo);
	
	}
/*=======================================================================================================*/	
	
}

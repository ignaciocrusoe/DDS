public class Persona{

    private String nombre;

    private String direcEnvio;

    private String direcCobro;

    private String email;

    private Integer numero;

    private Boolean esPreferencial;

    public static void main(String[] args) {}

    public Persona(){

    }

    public String getNombre(){
        return this.nombre;
    }

    public Void cambiarNombre(String nombre){this.nombre = nombre;}
    public Void cambiarDirecEnvio(String direcEnvio){this.direcEnvio = direcEnvio;}
    public Void cambiarDirecCobro(String direcCobro){this.direcCobro = direcCobro;}
    public Void cambiarEmail(String email){this.email = email;}
    public Void cambiarNumero(Integer numero){this.numero = numero;}
    public Void cambiarEmail(Boolean esPreferencial){this.esPreferencial = esPreferencial;}

    
    
        

    
}
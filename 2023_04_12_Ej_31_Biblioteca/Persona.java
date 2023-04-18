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

    public void cambiarNombre(String nombre){this.nombre = nombre;}
    public void cambiarDirecEnvio(String direcEnvio){this.direcEnvio = direcEnvio;}
    public void cambiarDirecCobro(String direcCobro){this.direcCobro = direcCobro;}
    public void cambiarEmail(String email){this.email = email;}
    public void cambiarNumero(Integer numero){this.numero = numero;}
    public void cambiarEmail(Boolean esPreferencial){this.esPreferencial = esPreferencial;}

    
}
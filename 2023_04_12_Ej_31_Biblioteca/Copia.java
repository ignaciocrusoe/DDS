

public class Copia{

    private String id;
    private Estado estado;
    private Libro libro;

    public Copia(String id, Estado estado, Libro libro) {
        this.id = id;
        this.estado = estado;
        this.libro = libro;
    }

    // Getter y setter para el atributo "estado"
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}

public class Estado{
    private String descripcion;

    public Estado(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
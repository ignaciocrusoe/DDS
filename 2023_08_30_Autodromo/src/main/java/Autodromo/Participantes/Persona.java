package Autodromo.Participantes;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_persona")
    private long idPersona;

    @Column(name="nombre")
    private String nombre;
    @Column(name="dni")
    private int dni;
    @Column(name="fecha_nacimiento")
    private Date fechaDeNacimiento;
    @Column(name="peso")
    private float peso;
    @ManyToOne
    @Column(name="tecnicoEquipo")
    private EquipoDeCompeticion tecnicoEquipo;
    public void verificarIdentidad(){} //fijate como se verifica more (xd)

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public EquipoDeCompeticion getTecnicoEquipo() {
        return tecnicoEquipo;
    }

    public void setTecnicoEquipo(EquipoDeCompeticion tecnicoEquipo) {
        this.tecnicoEquipo = tecnicoEquipo;
    }
}

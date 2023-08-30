package Autodromo.Participantes;

import Autodromo.Competencias.Competencia;
import Autodromo.Vehiculos.Vehiculo;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class EquipoDeCompeticion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_equipo")
    private long idEquipo;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(mappedBy = "tecnicoEquipo")
    private List<Tecnico> tecnicos;

    @OneToMany(mappedBy = "corredorEquipo")
    private List<Corredor> corredores;
    @OneToMany(mappedBy = "personaEquipo")
    private List<Persona> personas;
    @OneToMany(mappedBy = "vehiculoEquipo")
    private List<Vehiculo> vehiculos;
    @ManyToOne
    @JoinColumn(name = "id_competencia")
    private Competencia equiposCompetencia;

    public long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}

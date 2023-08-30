package Autodromo.Vehiculos;

import Autodromo.Participantes.EquipoDeCompeticion;
import jakarta.persistence.*;

@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_vehiculo")
    private long idVehiculo;
    @Column(name="modelo")
    private String modelo;

    @Column(name="marca")
    private String marca;
    @Column(name="peso")
    private float peso;
    @ManyToOne()
    @JoinColumn(name = "id_equipo")
    private EquipoDeCompeticion equipo;

    public long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public EquipoDeCompeticion getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoDeCompeticion equipo) {
        this.equipo = equipo;
    }


}

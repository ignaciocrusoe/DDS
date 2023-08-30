package Autodromo.Vehiculos;

import Autodromo.Participantes.EquipoDeCompeticion;
import jakarta.persistence.*;

@Entity
public class Karting extends Vehiculo{
    private float velocidadMaxima;

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Karting(long idVehiculo, String modelo, String marca, float peso, EquipoDeCompeticion equipo, float velocidadMaxima) {
        super(idVehiculo, modelo, marca, peso, equipo);
        this.velocidadMaxima = velocidadMaxima;
    }

    public Karting() {
    }
}

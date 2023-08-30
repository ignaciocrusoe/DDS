package Autodromo.Vehiculos;

import Autodromo.Participantes.EquipoDeCompeticion;
import jakarta.persistence.*;

@Entity
public class Bicicleta extends Vehiculo {
    private int rodado;

    public int getRodado() {
        return rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }

    public Bicicleta(long idVehiculo, String modelo, String marca, float peso, EquipoDeCompeticion equipo, int rodado) {
        super(idVehiculo, modelo, marca, peso, equipo);
        this.rodado = rodado;
    }

    public Bicicleta() {
    }
}

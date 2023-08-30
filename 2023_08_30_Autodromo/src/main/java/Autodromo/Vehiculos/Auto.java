package Autodromo.Vehiculos;

import Autodromo.Participantes.EquipoDeCompeticion;
import jakarta.persistence.*;

@Entity
public class Auto extends Vehiculo{

    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Auto(long idVehiculo, String modelo, String marca, float peso, EquipoDeCompeticion equipo, int cilindrada) {
        super(idVehiculo, modelo, marca, peso, equipo);
        this.cilindrada = cilindrada;
    }

    public Auto() {
    }
}

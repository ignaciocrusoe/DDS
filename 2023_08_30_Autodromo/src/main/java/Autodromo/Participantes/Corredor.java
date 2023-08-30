package Autodromo.Participantes;

import Autodromo.Competencias.Competencia;
import jakarta.persistence.*;

@Entity
public class Corredor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Corredor")
    private long idCorredor;
    @Column(name="nombre")
    private String nombre;
    @ManyToOne
    @Column(name="corredorEquipo")
    private EquipoDeCompeticion corredorEquipo;
    public void inscribirse(Competencia competencia){} //hay que agregar en la lista de competencias al corredor
    public void verificarAntecedentes(){} //Habria que agregar antecedentes al corredor?

    public long getIdCorredor() {
        return idCorredor;
    }

    public void setIdCorredor(long idCorredor) {
        this.idCorredor = idCorredor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EquipoDeCompeticion getCorredorEquipo() {
        return corredorEquipo;
    }

    public void setCorredorEquipo(EquipoDeCompeticion corredorEquipo) {
        this.corredorEquipo = corredorEquipo;
    }
}

package Autodromo.Participantes;

import Autodromo.Certificado.Certificado;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tecnico")
    private long idTecnico;
    @Column(name="nombre")
    private String nombre;
    @Transient
    private List<Certificado> certificadoDeEstudio;
    @ManyToOne
    @JoinColumn(name="id_equipo")
    private EquipoDeCompeticion tecnicoEquipo;
    public void solicitarCertificados(){}

    public long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Certificado> getCertificadoDeEstudio() {
        return certificadoDeEstudio;
    }

    public void setCertificadoDeEstudio(List<Certificado> certificadoDeEstudio) {
        this.certificadoDeEstudio = certificadoDeEstudio;
    }

    public EquipoDeCompeticion getTecnicoEquipo() {
        return tecnicoEquipo;
    }

    public void setTecnicoEquipo(EquipoDeCompeticion tecnicoEquipo) {
        this.tecnicoEquipo = tecnicoEquipo;
    }
}

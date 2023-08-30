package Autodromo.Autodromo;

import Autodromo.Competencias.Competencia;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="autodromo")
public class Autodromo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_autodromo")
    private Long id_autodromo;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(mappedBy = "autodromo")
    private List<Competencia> competencias;
    @OneToMany(mappedBy = "espaciosAutodromo")
    private List<Espacio> espacios;

    public void asignarEspacio(Espacio espacio){
        this.espacios.add(espacio);
    }

    public Long getId_autodromo() {
        return id_autodromo;
    }

    public void setId_autodromo(Long id_autodromo) {
        this.id_autodromo = id_autodromo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }

    public List<Espacio> getEspacios() {
        return espacios;
    }

    public void setEspacios(List<Espacio> espacios) {
        this.espacios = espacios;
    }
}



package Autodromo.Competencias;

import Autodromo.Participantes.EquipoDeCompeticion;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Competencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_competencia")
    private Long idCompetencia;
    @Column(name="nombre")
    private String nombre;

    @OneToOne
    @Column(name="entidad_organizadora")
    private EntidadOrganizadora entidadOrganizador;
    @Column(name="fecha_competencia")
    private Date fechaCompetencia;

    @OneToMany(mappedBy = "equiposCompetencia")
    private List<EquipoDeCompeticion> equipos;

    @Column(name = "tipoActividad")
    private TipoActividad tipoActividad;


}

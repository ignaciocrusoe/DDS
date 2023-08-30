package Autodromo.Competencias;

import jakarta.persistence.*;

@Entity
public class EntidadOrganizadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_entidad")
    private Long idEntidad;
    private String nombre;
}

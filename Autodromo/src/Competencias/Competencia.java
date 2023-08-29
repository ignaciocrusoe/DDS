package Competencias;

import java.util.ArrayList;
import java.util.Date;


public class Competencia {
    enum TipoActividad {
        AUTO, BICICLETA, KARTING
    }

    public static void main(String[] args){

    }
    private String nombre;
    private EntidadOrganizadora entidadOrganizador;
    private Date fechaCompetencia;
    private List<EquiposDeCompeticion> equipos = new ArrayList<EquiposDeCompeticion>();

    private TipoActividad tipoActividad;


}

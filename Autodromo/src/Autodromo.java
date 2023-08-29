import Competencias.Competencia;

import java.util.ArrayList;
import java.util.List;

public class Autodromo {
    private String nombre;
    private List<Competencia> competencias = new ArrayList<Competencia>();
    private List<Espacio> espacios = new ArrayList<Espacio>();

    public void asignarEspacio(Espacio espacio){
        this.espacios.add(espacio);
    }

}



package Autodromo.Autodromo;

import jakarta.persistence.*;

@Entity
public class Espacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_espacio")
    private long idEspacio;

    @ManyToOne
    @Column(name="espaciosAutodromo")
    private Autodromo espaciosAutodromo;
    public long getIdEspacio() {
        return idEspacio;
    }
    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public Autodromo getespaciosAutodromo() {
        return espaciosAutodromo;
    }

    public void setespaciosAutodromo(Autodromo autodromo) {
        this.espaciosAutodromo = autodromo;
    }
}

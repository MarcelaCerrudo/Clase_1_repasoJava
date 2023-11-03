
package clase_1_repasojava;

import java.util.ArrayList;
import java.util.List;


public class Materia {
private String nombreMateria;
    private List<Materia> correlativas;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
        correlativas = new ArrayList<>();
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia nombreMateria) {
        correlativas.add(nombreMateria);
    }

}

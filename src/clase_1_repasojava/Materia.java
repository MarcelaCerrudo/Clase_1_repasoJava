package clase_1_repasojava;
import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombreMateria;
    private List<Materia> correlativas = new ArrayList<>();
    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
   public List<Materia> getCorrelativas() {
        return correlativas;
    }

   public void setCorrelativas(List<Materia> correlativas) {
    this.correlativas = correlativas;
}

    @Override
    public String toString() {
        return nombreMateria;
    }
   

    }  

   
        
    
    
    



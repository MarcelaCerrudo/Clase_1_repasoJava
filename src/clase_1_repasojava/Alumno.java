

package clase_1_repasojava;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private int dniAlumno;

    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(int dniAlumno, String apellido, String nombre, LocalDate fechaNac) {
        this.dniAlumno = dniAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public int getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(int dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Alumno(int dniAlumno, String apellido, String nombre) {
        this.dniAlumno = dniAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
    }
   
   

    
}

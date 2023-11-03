package clase_1_repasojava;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombreApellido;
    private int dni;
    private List<Inscripcion> inscripciones;

    public Alumno(int dni) {
        this.dni = dni;
    }
    

    public Alumno(String nombreApellido, int dni) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.inscripciones = new ArrayList<>();
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void inscripto(Materia nombreMateria) {
        Inscripcion inscripcion = new Inscripcion( nombreMateria);
        inscripciones.add(inscripcion);
    }

}

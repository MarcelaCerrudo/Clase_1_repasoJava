
package clase_1_repasojava;

import java.util.List;


public class Inscripcion {
    private Alumno dniAlumno;
    private Materia nombreMateria;

    public Inscripcion(Alumno dniAlumno, Materia nombreMateria) {
        this.dniAlumno = dniAlumno;
        this.nombreMateria = nombreMateria;
    }

    public Inscripcion(Materia nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    

    
    

    public Alumno getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(Alumno dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public Materia getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(Materia nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
 
     

  
     public boolean aprobado() {
        List<Materia> correlativas = nombreMateria.getCorrelativas();
        for (Materia correlativa : correlativas) {
            boolean aprobada = false;
            for (Inscripcion inscripcion : dniAlumno.getInscripciones()) {
                if (inscripcion.getNombreMateria() == correlativa) {
                    aprobada = true;
                    break;
                }
            }
            if (!aprobada) {
                return false;
            }
        }
        return true;
    }

   // public Materia getMateria() {
        //return nombreMateria;//
    //}

    
   }

    
    


package clase_1_repasojava;

import clase_1_repasojava.Alumno;
import java.util.ArrayList;
import java.util.List;

public class clase_1_repaso {

    public static void main(String[] args) {

        Alumno alumno = new Alumno(41525895, "Almiron", "Adrian");
        alumno.setMateriasAprobadas(getMateriaAlumno());
  
        Materia materiaAInscribir = new Materia("Analisis Matemático III");
        materiaAInscribir.setCorrelativas(getMateriaCorrelativas());
        
        System.out.println("Las materias correlativas de "+materiaAInscribir.getNombreMateria()+" son "+materiaAInscribir.getCorrelativas());
        System.out.println("Sus materias aprobadas son: "+alumno.getMateriasAprobadas());
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateria(materiaAInscribir);
        inscripcion.setAlumno(alumno);

        boolean inscripcionAprobada = inscripcion.aprobada();
        

        if (inscripcionAprobada) {
            System.out.println("Se pudo inscribir: "+(String.valueOf(inscripcionAprobada)));
        } else {
            System.out.println("No se pudo inscribir: "+(String.valueOf(inscripcionAprobada)));
        }


    }

    static List<Materia> getMateriaAlumno() {
        List<Materia> materiasAprobadas = new ArrayList<>();
        Materia m1 = new Materia("Analisis Matemático I");
        Materia m2 = new Materia("Algebra");
      Materia m3 = new Materia("Análisis matemático II");

        materiasAprobadas.add(m1);
        materiasAprobadas.add(m2);
        materiasAprobadas.add(m3);

        return materiasAprobadas;
    }

    static List<Materia> getMateriaCorrelativas() {
        List<Materia> materiasCorrelativas = new ArrayList<>();
        Materia mC1 = new Materia("Analisis Matemático I");
       Materia mC2 = new Materia("Algebra");
        Materia mC3 = new Materia("Análisis matemático II");

        materiasCorrelativas.add(mC1);
        materiasCorrelativas.add(mC2);
        materiasCorrelativas.add(mC3);

        return materiasCorrelativas;
    }
}

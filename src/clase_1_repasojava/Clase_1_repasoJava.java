
package clase_1_repasojava;

import javax.swing.JOptionPane;




public class Clase_1_repasoJava {

   
    public static void main(String[] args) {
   
   
        Materia analisisMatematicoI = new Materia("analisisMatematicoI");
        Materia analisisMatematicoII = new Materia("analisisMatematicoII");
        Materia analisisMatematicoIII = new Materia("analisisMatematicoIII");

        analisisMatematicoII.agregarCorrelativa(analisisMatematicoI);
        analisisMatematicoIII.agregarCorrelativa(analisisMatematicoII);

        Alumno alumno1 = new Alumno("Juan Perez", 25536586);
        alumno1.inscripto(analisisMatematicoI);
        alumno1.inscripto(analisisMatematicoII);
        alumno1.inscripto(analisisMatematicoIII);
      

        System.out.println("¿25536586 puede inscribirse en analisis Matemático III? " + alumno1.getInscripciones().get(1).aprobado());
    }
}

   
    
    


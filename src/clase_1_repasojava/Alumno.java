package clase_1_repasojava;

public class Alumno {
    private int idAlumno;
    private int dni;
    private String Apellido;
    private String Nombre;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(int dni, String Apellido, String Nombre, boolean activo) {
        this.dni = dni;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.activo = activo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

}

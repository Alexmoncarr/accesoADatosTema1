package miniProyectoCRUD;

import java.util.Objects;

public class alumno {
    private int idAlumno;
    private String nombre;
    private int edad;
    private String semestre;
    private int promedio;
    private String escuela;


    public alumno() {
    }

    public alumno(int idAlumno, String nombre, int edad, String semestre, int promedio, String escuela) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.promedio = promedio;
        this.escuela = escuela;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public boolean equals(Object o)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        alumno alumno = (alumno) o;
        return idAlumno == alumno.idAlumno && edad == alumno.edad && promedio == alumno.promedio && Objects.equals(nombre, alumno.nombre) && Objects.equals(semestre, alumno.semestre) && Objects.equals(escuela, alumno.escuela);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, nombre, edad, semestre, promedio, escuela);
    }
}

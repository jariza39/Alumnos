public class Alumno {
    // Crea una clase Alumno con propiedades como nombre, edad y calificaciones. Luego, 
    // crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones ,
    //  calcular el promedio de sus calificaciones y mostrar la información de cada alumno.
    private String nombre;
    private int edad;
    private float[] calificaciones = new float[3];

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    

}




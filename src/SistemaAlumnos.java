// crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones ,
    //  calcular el promedio de sus calificaciones y mostrar la información de cada alumno.
public class SistemaAlumnos {
    public Alumno[] alumnos;
    public int cantidadAlumnos;

    public SistemaAlumnos(int cantidadAlumnos) {
        this.alumnos = new Alumno[cantidadAlumnos];
        this.cantidadAlumnos = 0;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos[this.cantidadAlumnos] = alumno;
        this.cantidadAlumnos++;
    }

    public void asignarCalificacion(String nombre, float calificacion){
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNombre().equals(nombre)) {
                for (int j = 0; j < alumnos[i].getCalificaciones().length; j++) {
                    if (alumnos[i].getCalificaciones()[j] == 0) {
                        alumnos[i].getCalificaciones()[j] = calificacion;
                        break;
                    }
                }
            }
        }
    }

    public float calcularPromedio(String nombre){
        float promedio = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNombre().equals(nombre)) {
                for (int j = 0; j < alumnos[i].getCalificaciones().length; j++) {
                    promedio += alumnos[i].getCalificaciones()[j];
                }
                promedio = promedio / alumnos[i].getCalificaciones().length;
            }
        }
        return promedio;
    }

    public void mostrarInformacion(String nombre){
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNombre().equals(nombre)) {
                System.out.println("Nombre: " + alumnos[i].getNombre());
                System.out.println("Edad: " + alumnos[i].getEdad());
                System.out.println("Calificaciones: ");
                for (int j = 0; j < alumnos[i].getCalificaciones().length; j++) {
                    System.out.println(alumnos[i].getCalificaciones()[j]);
                }
                System.out.println("Promedio: " + calcularPromedio(nombre));
            }
        }
    }   
}



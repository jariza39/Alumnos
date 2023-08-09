public class App {
    public static void main(String[] args) throws Exception {
        SistemaAlumnos sistema = new SistemaAlumnos(2);
        Alumno alumno1 = new Alumno("Juan", 20);
        Alumno alumno2 = new Alumno("Pedro", 21);
        sistema.agregarAlumno(alumno1);
        sistema.agregarAlumno(alumno2);
        sistema.asignarCalificacion("Juan", 10);
        sistema.asignarCalificacion("Juan", 9);
        sistema.asignarCalificacion("Juan", 8);
        sistema.asignarCalificacion("Pedro", 7);
        sistema.asignarCalificacion("Pedro", 6);
        sistema.asignarCalificacion("Pedro", 5);
        sistema.mostrarInformacion("Juan");
        sistema.mostrarInformacion("Pedro");
    }
}

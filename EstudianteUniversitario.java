public class EstudianteUniversitario {
    private String legajo;
    private String nombreCompleto;
    private double calificacionFinal;
    private double estaAprobado;

    public EstudianteUniversitario(String legajo, String nombreCompleto, double calificacionFinal) {
        this.legajo = legajo;
        this.nombreCompleto = nombreCompleto;
        this.calificacionFinal = calificacionFinal;
        this.estaAprobado = calificacionFinal >= 6 ? 1.0 : 0.0;


        if (calificacionFinal < 0 || calificacionFinal > 10) {
        }

        System.out.println("Estudiante creado: " + nombreCompleto + " con legajo: " + legajo + " y calificación final: " + calificacionFinal);
        System.out.println("Estado de aprobación: " + (estaAprobado == 1.0 ? "Aprobado" : "Desaprobado"));
    }
}

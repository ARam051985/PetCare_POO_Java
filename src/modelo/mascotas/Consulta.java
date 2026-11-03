package modelo.mascotas;

import java.time.LocalDateTime;

/**
 * Representa una consulta por individual.
 */

public class Consulta {
    private LocalDateTime fechaHora;
    private String diagnostico;
    private String tipoTratamiento;

    /** @return Los datos de una consulta por individual */
    public String mostrarConsulta() {
        return "Fecha y hora de la cita: " + fechaHora + "." +
                "\nDiagnóstico: " + diagnostico + "." +
                "\nTipo de tratamiento: " + tipoTratamiento + ".";
    }

    @Override
    public String toString() {
        return "Consulta [" +
                "Fecha y Hora: " + fechaHora +
                ", Diagnóstico: " + diagnostico +
                ", Tratamiento: " + tipoTratamiento +
                ']';
    }
}

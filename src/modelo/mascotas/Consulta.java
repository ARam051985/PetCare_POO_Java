package modelo.mascotas;

import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime fechaHora;
    private String diagnostico;
    private String tipoTratamiento;

    public String mostrarConsulta() {
        return "Fecha y hora de la cita: " + fechaHora + "." +
                "\nDiagnóstico: " + diagnostico + "." +
                "\nTipo de tratamiento: " + tipoTratamiento + ".";
    }
}

package modelo.mascotas;

import java.util.List;

/**
 * Representa el historial clínico de cada mascota.
 */

public class HistorialClinico {
    private List<Consulta> consultas;

    /** @param consulta Consulta a asignar. */
    public void anadirConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    /** @return La lista de consultas de una mascota */
    public List<Consulta> mostrarHistorialConsultas() {
        return consultas;
    }

    @Override
    public String toString() {
        return "Historial clínico [" +
                "Consultas registradas: " + consultas +
                ']';
    }
}

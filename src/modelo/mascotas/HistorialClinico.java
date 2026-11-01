package modelo.mascotas;

import java.util.List;

public class HistorialClinico {
    private List<Consulta> consultas;

    public void anadirConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> mostrarHistorialConsultas() {
        return consultas;
    }
}

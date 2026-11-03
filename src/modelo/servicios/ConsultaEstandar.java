package modelo.servicios;

/**
 * Representa el servicio de consultas estándares y calcula solo la tarifa base.
 */

public class ConsultaEstandar extends ConsultaGeneral {
    /**
     * Calcula el costo total de la consulta estándar según tarifa base.
     * @return El costo total calculado de la consulta estándar.
     */
    public ConsultaEstandar() {
        setTarifaBase(49.99);
    }

    @Override
    public String toString() {
        return "Consulta estándar [" +
                "Tarifa base: " + tarifaBase +
                ']';
    }
}

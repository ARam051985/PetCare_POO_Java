package modelo.servicios;

/**
 * Representa el servicio de consultas generales.
 */

public abstract class ConsultaGeneral implements Servicio {
    protected static double tarifaBase;

    /** @param tarifaBase Tarifa base a asignar. */
    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    /**
     * Calcula el costo total de la consulta general según tarifa base.
     * @return El costo total calculado de la consulta general.
     */
    public double calcularCosto() {
        return this.tarifaBase;
    }

    @Override
    public String toString() {
        return "Consulta general [" +
                "Tarifa base: " + tarifaBase +
                ']';
    }
}

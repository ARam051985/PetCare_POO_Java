package modelo.servicios;

/**
 * Representa el servicio de vacunación y suma la tarifa base con el costo de la vacuna.
 */


public class Vacunacion extends ConsultaGeneral implements Servicio {
    private double costoVacuna;

    /** @param tarifaBase Tarifa base a asignar. */
    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    /** @param costoVacuna Costo de la vacunaa asignar. */
    public void setCostoVacuna(double costoVacuna) {
        if(costoVacuna <= 0.0) {
            throw new IllegalArgumentException("No puedes poner un costo de vacuna negativo");
        }
        this.costoVacuna = costoVacuna;
    }

    /**
     * Calcula el costo total de la cirugía según tarifa base y costo de la vacuna.
     * @return El costo total calculado de la vacuna.
     */
    public double calcularCosto() {
        return ConsultaGeneral.tarifaBase + costoVacuna;
    }

    @Override
    public String toString() {
        return "Vacunación [" +
                "Costo de vacuna: " + costoVacuna +
                ", Tarifa base: " + tarifaBase +
                ", Costo total: " + calcularCosto() +
                ']';
    }
}

package modelo.servicios;

/**
 * Representa el servicio de cirugía y calcula el costo basado en complejidad y horas.
 */

public class Cirugia implements Servicio {
    private double tarifaPorHora;
    private int nivelComplejidad;
    private int horasQuirofano;

    /** @param tarifaPorHora Tarifa por hora a asignar. */
    public void setTarifaPorHora(double tarifaPorHora) {
        if(tarifaPorHora <= 0) {
            throw new IllegalArgumentException("Tarifa por hora no válida");
        }
        this.tarifaPorHora = tarifaPorHora;
    }

    /** @param nivelComplejidad Nivel de complejidad a asignar. */
    public void setNivelComplejidad(int nivelComplejidad) {
        if(nivelComplejidad <= 0 || nivelComplejidad > 5) {
            throw new IllegalArgumentException("Nivel de complejidad no válido");
        }
        this.nivelComplejidad = nivelComplejidad;
    }

    /** @param horasQuirofano Horas de quirófano a asignar. */
    public void setHorasQuirofano(int horasQuirofano) {
        if(horasQuirofano <= 0) {
            throw new IllegalArgumentException("Horas de quirófano no válido");
        }
        this.horasQuirofano = horasQuirofano;
    }

    /**
     * Calcula el costo total de la cirugía según tarifa, complejidad y horas de quirófano.
     * @return El costo total calculado de la cirugía.
     */
    public double calcularCosto() {
        return this.tarifaPorHora * this.nivelComplejidad * this.horasQuirofano;
    }

    @Override
    public String toString() {
        return "Cirugía [" +
                "Tarifa por hora: " + tarifaPorHora +
                ", Nivel de complejidad: " + nivelComplejidad +
                ", Horas de quirófano: " + horasQuirofano +
                ", Costo total: " + calcularCosto() +
                ']';
    }
}

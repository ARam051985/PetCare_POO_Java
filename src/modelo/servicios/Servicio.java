package modelo.servicios;

/**
 * Interfaz que define el cálculo de los servicios médicos ofrecidos.
 */

public interface Servicio {
    /**
     * Calcula y retorna el costo total del servicio prestado.
     * @return Costo monetario del servicio.
     */
    public double calcularCosto();
}

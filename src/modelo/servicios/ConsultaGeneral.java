package modelo.servicios;

public abstract class ConsultaGeneral implements Servicio {
    protected static double tarifaBase;

    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase <= 0) {
            throw new IllegalArgumentException("No puedes poner una tarifa base negativa");
        }
        this.tarifaBase = tarifaBase;
    }

    public double calcularCosto() {
        return this.tarifaBase;
    }
}

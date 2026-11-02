package modelo.servicios;

public abstract class ConsultaGeneral implements Servicio {
    protected static double tarifaBase;

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double calcularCosto() {
        return this.tarifaBase;
    }
}

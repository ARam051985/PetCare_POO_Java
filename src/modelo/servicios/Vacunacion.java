package modelo.servicios;

public class Vacunacion implements Servicio {
    private double tarifaBase;
    private double costoVacuna;

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setCostoVacuna(double costoVacuna) {
        this.costoVacuna = costoVacuna;
    }

    public double calcularCosto() {
        return tarifaBase + costoVacuna;
    }
}

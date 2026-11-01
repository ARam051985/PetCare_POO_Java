package modelo.servicios;

public class Vacunacion extends ConsultaGeneral implements Servicio {
    private double costoVacuna;

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setCostoVacuna(double costoVacuna) {
        this.costoVacuna = costoVacuna;
    }

    public double calcularCosto() {
        return ConsultaGeneral.tarifaBase + costoVacuna;
    }
}

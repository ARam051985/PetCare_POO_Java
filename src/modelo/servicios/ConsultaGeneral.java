package modelo.servicios;

public class ConsultaGeneral implements Servicio {
    protected double tarifaBase;

    public void setTarifaBase(double tarifaBase) {
        if(tarifaBase <= 0) {
            System.out.println("No puedes poner una tarifa base negativa");
            return;
        }
        this.tarifaBase = tarifaBase;
    }

    public double calcularCosto() {
        return this.tarifaBase;
    }
}

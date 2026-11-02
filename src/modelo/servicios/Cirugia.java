package modelo.servicios;

public class Cirugia implements Servicio {
    private double tarifaPorHora;
    private int nivelComplejidad;
    private int horasQuirofano;

    public void setTarifaPorHora(double tarifaPorHora) {
        if(tarifaPorHora <= 0) {
            System.out.println("Tarifa por hora no válida");
            return;
        }
        this.tarifaPorHora = tarifaPorHora;
    }

    public void setNivelComplejidad(int nivelComplejidad) {
        if(nivelComplejidad <= 0) {
            throw new IllegalArgumentException("Nivel de complejidad no válido");
        }
        this.nivelComplejidad = nivelComplejidad;
    }

    public void setHorasQuirofano(int horasQuirofano) {
        if(horasQuirofano <= 0) {
            throw new IllegalArgumentException("Horas de quirófano no válido");
        }
        this.horasQuirofano = horasQuirofano;
    }

    public double calcularCosto() {
        double costoTotal = 0;
        costoTotal = this.tarifaPorHora * this.nivelComplejidad * this.horasQuirofano;

        System.out.println("Tarifa por hora: " + this.tarifaPorHora + ".\n" +
                            "Nivel de complejidad: " + this.nivelComplejidad + ".\n" +
                            "Horas de quirófano: " + this.horasQuirofano + ".\n" +
                            "Costo total: " + costoTotal + ".");
        return costoTotal;
    }

}

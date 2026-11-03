package modelo.servicios;

public class Cirugia implements Servicio {
    private double tarifaPorHora;
    private int nivelComplejidad;
    private int horasQuirofano;

    public void setTarifaPorHora(double tarifaPorHora) {
        if(tarifaPorHora <= 0) {
            throw new IllegalArgumentException("Tarifa por hora no válida");
        }
        this.tarifaPorHora = tarifaPorHora;
    }

    public void setNivelComplejidad(int nivelComplejidad) {
        if(nivelComplejidad <= 0 || nivelComplejidad > 5) {
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
        return this.tarifaPorHora * this.nivelComplejidad * this.horasQuirofano;
    }
}

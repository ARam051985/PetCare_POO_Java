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
            System.out.println("Nivel de complejidad no válido");
            return;
        }
        this.nivelComplejidad = nivelComplejidad;
    }

    public void setHorasQuirofano(int horasQuirofano) {
        if(horasQuirofano <= 0) {
            System.out.println("Horas de quirófano no válido");
            return;
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

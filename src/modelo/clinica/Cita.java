package modelo.clinica;

import java.time.LocalDateTime;

public class Cita {
    private LocalDateTime fechaHora;
    private EstadoCita estadoCita;

    Cita(LocalDateTime fechaHora, EstadoCita estadoCita) {
        setFechaHora(fechaHora);
        setEstadoCita(estadoCita);
    }

    public LocalDateTime getFechaHora() {return this.fechaHora;}
    public EstadoCita getEstadoCita() {return this.estadoCita;}

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
}

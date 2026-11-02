package modelo.clinica;

import modelo.mascotas.Mascota;
import modelo.personas.Veterinario;
import modelo.servicios.Servicio;


import java.time.LocalDateTime;

public class Cita {
    private LocalDateTime fechaHora;
    private EstadoCita estadoCita;
    private Mascota mascota;
    private Veterinario veterinario;
    private Consultorio consultorio;
    private Servicio servicio;

    public Cita(Mascota mascota, Veterinario veterinario, Consultorio consultorio,
                Servicio servicio, LocalDateTime fechaHora, EstadoCita estadoCita) {
        setMascota(mascota);
        setVeterinario(veterinario);
        setConsultorio(consultorio);
        setServicio(servicio);
        setFechaHora(fechaHora);
        setEstadoCita(estadoCita);
    }

    public Mascota getMascota() {return mascota;}
    public Veterinario getVeterinario() {return veterinario;}
    public Consultorio getConsultorio() {return consultorio;}
    public LocalDateTime getFechaHora() {return this.fechaHora;}
    public EstadoCita getEstadoCita() {return this.estadoCita;}

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        if(estadoCita == EstadoCita.CANCELADA) {
            throw new IllegalArgumentException("No puedes marcar una cita cancelada como atendida");
        }
        if(estadoCita == EstadoCita.ATENDIDA) {
            throw new IllegalArgumentException("Ya marcaste esta cita como atendida");
        }
        this.estadoCita = estadoCita;
    }
}

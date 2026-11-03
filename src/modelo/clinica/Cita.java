package modelo.clinica;

import modelo.mascotas.Mascota;
import modelo.personas.Veterinario;
import modelo.servicios.Servicio;


import java.time.LocalDateTime;

/**
 * Representa una cita médica programada dentro de la veterinaria.
 * Relaciona una mascota, un veterinario, un consultorio y un servicio específico.
 */

public class Cita {
    private Mascota mascota;
    private Veterinario veterinario;
    private Consultorio consultorio;
    private Servicio servicio;
    private LocalDateTime fechaHora;
    private EstadoCita estadoCita;

    /**
     * Constructor para inicializar una nueva cita en el sistema.
     *
     * @param mascota Mascota que recibirá la atención.
     * @param veterinario Veterinario encargado de la cita.
     * @param consultorio Consultorio asignado para la atención.
     * @param servicio Servicio médico a realizar.
     * @param fechaHora Fecha y hora programada para la cita.
     * @param estadoCita Estado inicial o actual de la cita.
     */
    public Cita(Mascota mascota, Veterinario veterinario, Consultorio consultorio,
                Servicio servicio, LocalDateTime fechaHora, EstadoCita estadoCita) {
        setMascota(mascota);
        setVeterinario(veterinario);
        setConsultorio(consultorio);
        setServicio(servicio);
        setFechaHora(fechaHora);
        setEstadoCita(estadoCita);
    }

    /** @return La mascota asociada a la cita. */
    public Mascota getMascota() {return this.mascota;}

    /** @return El veterinario asignado a la cita. */
    public Veterinario getVeterinario() {return this.veterinario;}

    /** @return El consultorio donde se llevará a cabo la cita. */
    public Consultorio getConsultorio() {return this.consultorio;}

    /** @return El servicio médico contratado para la cita. */
    public Servicio getServicio() {return this.servicio;}

    /** @return La fecha y hora de la cita. */
    public LocalDateTime getFechaHora() {return this.fechaHora;}

    /** @return El estado actual de la cita. */
    public EstadoCita getEstadoCita() {return this.estadoCita;}

    /** @param mascota La mascota a establecer. */
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    /** @param veterinario El veterinario a establecer. */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /** @param consultorio El consultorio a establecer. */
    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    /** @param servicio El servicio a establecer. */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /** @param fechaHora La fecha y hora a establecer. */
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * Modifica el estado de la cita validando las reglas de negocio.
     *
     * @param estadoCita Nuevo estado a asignar.
     * @throws IllegalArgumentException si se intenta violar una regla de transición de estados.
     */
    public void setEstadoCita(EstadoCita estadoCita) {
        if(this.estadoCita == EstadoCita.CANCELADA && estadoCita == EstadoCita.ATENDIDA) {
            throw new IllegalArgumentException("No puedes marcar una cita cancelada como atendida");
        }
        if(this.estadoCita == EstadoCita.ATENDIDA) {
            throw new IllegalArgumentException("Ya marcaste esta cita como atendida");
        }
        this.estadoCita = estadoCita;
    }
}

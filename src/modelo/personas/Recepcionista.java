package modelo.personas;

/**
 * Representa a un recepcionista registrado en la clínica, heredando de Persona.
 */

public class Recepcionista extends Persona {
    private String turno;

    /**
     * Constructor del recepcionista.
     * @param nombre Nombre del recepcionista.
     * @param apellido Apellido del recepcionista.
     * @param telefono Teléfono del recepcionista.
     * @param correo Correo electrónico del recepcionista.
     * @param turno Turno del recepcionista.
     */
    public Recepcionista(String nombre, String apellido, String telefono, String correo, String turno) {
        super(nombre, apellido, telefono, correo);
        setTurno(turno);
    }

    /** @return Turno del recepcionista */
    public String getTurno() {return this.turno;}

    /** @param turno Turno a asignar. */
    public void setTurno(String turno) {
        if(turno == null || turno.isBlank()) {
            throw new IllegalArgumentException("Turno obligatorio");
        }
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Recepcionista [" +
                "Datos: " + getDatosPersonales() +
                ", Turno: " + turno +
                ']';
    }
}

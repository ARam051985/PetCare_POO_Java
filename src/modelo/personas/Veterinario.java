package modelo.personas;

/**
 * Representa a un veterinario registrado en la clínica, heredando de Persona.
 */

public class Veterinario extends Persona {
    private String cedulaProfesional;
    private String especialidad;

    /**
     * Constructor del veterinario.
     * @param nombre Nombre del veterinario.
     * @param apellido Apellido del veterinario.
     * @param telefono Teléfono del veterinario.
     * @param correo Correo electrónico del veterinario.
     * @param cedulaProfesional Cédula profesional oficial.
     * @param especialidad Especialidad médica veterinaria.
     */
    public Veterinario(String nombre, String apellido, String telefono, String correo,
                       String cedulaProfesional, String especialidad) {
        super(nombre, apellido, telefono, correo);
        setCedulaProfesional(cedulaProfesional);
        setEspecialidad(especialidad);
    }

    /** @return Cédula profesional del veterinario */
    public String getCedulaProfesional() {return this.cedulaProfesional;}

    /** @return Especialidad médica del veterinario */
    public String getEspecialidad() {return this.especialidad;}

    /** @param cedulaProfesional Cédula profesional a asignar. */
    public void setCedulaProfesional(String cedulaProfesional) {
        if(cedulaProfesional == null || cedulaProfesional.isBlank()) {
            throw new IllegalArgumentException("Cédula profesional obligatoria");
        }
        this.cedulaProfesional = cedulaProfesional;
    }

    /** @param especialidad Especialidad a asignar. */
    public void setEspecialidad(String especialidad) {
        if(especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("Especialidad obligatoria");
        }
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Veterinario [" +
                "Datos: " + getDatosPersonales() +
                ", Cédula profesional: " + cedulaProfesional +
                ", Especialidad: " + especialidad +
                ']';
    }
}

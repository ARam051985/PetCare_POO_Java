package modelo.personas;

/**
 * Representa a un dueño registrado en la clínica, heredando de Persona.
 */

public class Dueno extends Persona {
    private String direccion;

    /**
     * Constructor del dueño.
     * @param nombre Nombre del dueño.
     * @param apellido Apellido del dueño.
     * @param telefono Teléfono del dueño.
     * @param correo Correo electrónico del dueño.
     * @param direccion Dirección del dueño.
     */
    public Dueno(String nombre, String apellido, String telefono, String correo, String direccion) {
        super(nombre, apellido, telefono, correo);
        setDireccion(direccion);
    }

    /** @return Dirección del dueño */
    public String getDireccion() {return direccion;}

    /** @param direccion Dirección a asignar. */
    public void setDireccion(String direccion) {
        if(direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException("Dirección obligatoria");
        }
        this.direccion = direccion;
    }
}

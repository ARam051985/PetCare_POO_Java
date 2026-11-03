package modelo.personas;

/**
 * Clase abstracta que representa de manera genérica a cualquier persona
 * vinculada con la clínica (dueños, veterinarios y recepcionistas).
 */

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    /**
     * Constructor para inicializar los datos personales básicos.
     *
     * @param nombre Nombre(s) de la persona.
     * @param apellido Apellido(s) de la persona.
     * @param telefono Teléfono de contacto.
     * @param correo Correo electrónico.
     */
    public Persona(String nombre, String apellido, String telefono, String correo) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setCorreo(correo);
    }

    /** @return Datos personales. */
    public String getDatosPersonales() {
        return "Nombre: " + nombre + ".\n" +
                "Apellido: " + apellido + ".\n" +
                "Teléfono: " + telefono + ".\n" +
                "Correo: " + correo + ".\n";
    }

    /** @param nombre Nombre a asignar. */
    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre(s) de persona obligatorio(s)");
        }
        this.nombre = nombre;
    }

    /** @param apellido Apellido a asignar. */
    public void setApellido(String apellido) {
        if(apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("Apellido(s) de persona obligatorio(s)");
        }
        this.apellido = apellido;
    }

    /** @param telefono Teléfono a asignar. */
    public void setTelefono(String telefono) {
        if(telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("Número de teléfono obligatorio");
        }
        this.telefono = telefono;
    }

    /** @param correo Correo electrónico a asignar. */
    public void setCorreo(String correo) {
        if(correo == null || correo.isBlank()) {
            throw new IllegalArgumentException(("Correo obligatorio"));
        }
        this.correo = correo;
    }
}

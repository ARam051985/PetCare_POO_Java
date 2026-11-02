package modelo.personas;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    public Persona(String nombre, String apellido, String telefono, String correo) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setCorreo(correo);
    }

    public String getDatosPersonales() {
        return "Nombre: " + nombre + ".\n" +
                "Apellido: " + apellido + ".\n" +
                "Teléfono: " + telefono + ".\n" +
                "Correo: " + correo + ".\n";
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre(s) de persona obligatorio(s)");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if(apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("Apellido(s) de persona obligatorio(s)");
        }
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        if(telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("Número de teléfono obligatorio");
        }
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        if(correo == null || correo.isBlank()) {
            throw new IllegalArgumentException(("Correo obligatorio"));
        }
        this.correo = correo;
    }
}

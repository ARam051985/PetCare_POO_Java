package modelo.personas;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;

    public Persona(String nombre, String apellido, int telefono, String correo) {
        setDatosPersonales(nombre, apellido, telefono, correo);
    }

    public String getDatosPersonales() {
        return "Nombre: " + nombre + ".\n" +
                "Apellido: " + apellido + ".\n" +
                "Teléfono: " + telefono + ".\n" +
                "Correo: " + correo + ".\n";
    }

    public void setDatosPersonales(String nombre, String apellido, int telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
}

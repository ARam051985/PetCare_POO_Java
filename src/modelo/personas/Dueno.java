package modelo.personas;

public class Dueno extends Persona {
    private String direccion;

    public Dueno(String nombre, String apellido, String telefono, String correo, String direccion) {
        super(nombre, apellido, telefono, correo);
        setDireccion(direccion);
    }

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {
        if(direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException("Dirección obligatoria");
        }
        this.direccion = direccion;
    }
}

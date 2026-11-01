package modelo.personas;

public class Dueno extends Persona {
    private String direccion;

    public Dueno(String nombre, String apellido, int telefono, String correo, String direccion) {
        super(nombre, apellido, telefono, correo);
        setDireccion(direccion);
    }

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

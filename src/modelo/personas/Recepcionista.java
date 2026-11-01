package modelo.personas;

public class Recepcionista extends Persona {
    private String turno;

    public Recepcionista(String nombre, String apellido, int telefono, String correo, String turno) {
        super(nombre, apellido, telefono, correo);
        setTurno(turno);
    }

    public String getTurno() {return this.turno;}

    public void setTurno(String turno) {
        this.turno = turno;
    }
}

package modelo.personas;

public class Recepcionista extends Persona {
    private String turno;

    public Recepcionista(String nombre, String apellido, String telefono, String correo, String turno) {
        super(nombre, apellido, telefono, correo);
        setTurno(turno);
    }

    public String getTurno() {return this.turno;}

    public void setTurno(String turno) {
        if(turno == null || turno.isBlank()) {
            throw new IllegalArgumentException("Turno obligatorio");
        }
        this.turno = turno;
    }
}

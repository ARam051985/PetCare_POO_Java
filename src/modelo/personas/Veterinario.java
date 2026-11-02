package modelo.personas;

public class Veterinario extends Persona {
    private String cedulaProfesional;
    private String especialidad;

    public Veterinario(String nombre, String apellido, String telefono, String correo,
                       String cedulaProfesional, String especialidad) {
        super(nombre, apellido, telefono, correo);
        setCedulaProfesional(cedulaProfesional);
        setEspecialidad(especialidad);
    }

    public String getCedulaProfesional() {return this.cedulaProfesional;}
    public String getEspecialidad() {return this.especialidad;}

    public void setCedulaProfesional(String cedulaProfesional) {
        if(cedulaProfesional == null || cedulaProfesional.isBlank()) {
            throw new IllegalArgumentException("Cédula profesional obligatoria");
        }
        this.cedulaProfesional = cedulaProfesional;
    }

    public void setEspecialidad(String especialidad) {
        if(especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("Especialidad obligatoria");
        }
        this.especialidad = especialidad;
    }
}

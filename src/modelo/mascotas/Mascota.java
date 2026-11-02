package modelo.mascotas;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private double peso;
    private String dueno;

    public Mascota(String nombre, int edad, double peso, String dueno) {
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
        setDueno(dueno);
    }

    public String getDatosMascota() {
        return "Nombre: " + nombre + ".\n" +
                "Edad: " + edad + ".\n" +
                "Peso: " + peso + ".\n" +
                "Dueño: " + dueno + ".\n";
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre de mascota obligatorio");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad <= 0) {
            throw new IllegalArgumentException("Edad no válida");
        }
        this.edad = edad;
    }

    public void setPeso(double peso) {
        if(peso <= 0.0) {
            throw new IllegalArgumentException("Peso no válido");
        }
        this.peso = peso;
    }

    public void setDueno(String dueno) {
        if(dueno == null || dueno.isBlank()) {
            throw new IllegalArgumentException("Dueño obligatorio");
        }
        this.dueno = dueno;
    }

    public abstract void emitirSonido();
}

package modelo.mascotas;

/**
 * Clase abstracta que define los atributos y comportamientos generales
 * de cualquier mascota registrada en la veterinaria.
 */

public abstract class Mascota {
    private String nombre;
    private int edad;
    private double peso;
    private String dueno;

    /**
     * Constructor para inicializar los datos generales de una mascota.
     *
     * @param nombre Nombre de la mascota.
     * @param edad Edad de la mascota en años.
     * @param peso Peso de la mascota en kilogramos.
     * @param dueno Nombre del dueño responsable.
     */
    public Mascota(String nombre, int edad, double peso, String dueno) {
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
        setDueno(dueno);
    }

    /** @return Datos principales de la mascota. */
    public String getDatosMascota() {
        return "Nombre: " + nombre + ".\n" +
                "Edad: " + edad + ".\n" +
                "Peso: " + peso + ".\n" +
                "Dueño: " + dueno + ".\n";
    }

    /** @param nombre Nombre de la mascota a asignar. */
    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre de mascota obligatorio");
        }
        this.nombre = nombre;
    }

    /** @param edad Edad de la mascota a asignar. */
    public void setEdad(int edad) {
        if(edad <= 0) {
            throw new IllegalArgumentException("Edad no válida");
        }
        this.edad = edad;
    }

    /** @param peso Peso de la mascota a asignar. */
    public void setPeso(double peso) {
        if(peso <= 0.0) {
            throw new IllegalArgumentException("Peso no válido");
        }
        this.peso = peso;
    }

    /** @param dueno Dueño de la mascota a asignar. */
    public void setDueno(String dueno) {
        if(dueno == null || dueno.isBlank()) {
            throw new IllegalArgumentException("Dueño obligatorio");
        }
        this.dueno = dueno;
    }

    /** Método abstracto para que cada tipo de mascota emita su sonido característico. */
    public abstract void emitirSonido();
}

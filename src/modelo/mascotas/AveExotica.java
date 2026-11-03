package modelo.mascotas;

/**
 * Clase concreta para definir los atributos del ave exótica.
 */

public class AveExotica extends Mascota {
    private double longitudAlas;

    /**
     * Constructor para inicializar los datos generales del ave exótica.
     *
     * @param nombre Nombre del ave exótica.
     * @param edad Edad del ave exótica en años.
     * @param peso Peso del ave exótica en kilogramos.
     * @param dueno Nombre del dueño responsable.
     * @param longitudAlas Longitud de alas del ave exótica en centímetros.
     */
    public AveExotica(String nombre, int edad, double peso, String dueno, double longitudAlas) {
        super(nombre, edad, peso, dueno);
        setLongitudAlas(longitudAlas);
    }

    /** @return Longitud de alas del ave exótica en centímetros. */
    public double getLongitudAlas() {return this.longitudAlas;}

    /** @param longitudAlas Longitud de alas del ave exótica en centímetros. */
    public void setLongitudAlas(double longitudAlas) {
        if(longitudAlas <= 0) {
            throw new IllegalArgumentException("Longitud de alas no válida");
        }
        this.longitudAlas = longitudAlas;
    }

    /** El ave exótica canta cuando se ejecuta este método */
    @Override
    public void emitirSonido() {
        System.out.println("El ave está cantando\n");
    }

    @Override
    public String toString() {
        return "Ave exotica [" +
                "Datos: " + getDatosMascota() +
                ", Longitud de alas: " + longitudAlas +
                ']';
    }
}

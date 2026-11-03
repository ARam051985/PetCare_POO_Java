package modelo.mascotas;

/**
 * Clase concreta para definir los atributos del gato.
 */


public class Gato extends Mascota {
    private boolean esDomestico;

    /**
     * Constructor para inicializar los datos generales del gato.
     *
     * @param nombre Nombre del gato.
     * @param edad Edad del gato en años.
     * @param peso Peso del gato en kilogramos.
     * @param dueno Nombre del dueño responsable.
     * @param esDomestico Determina si el gato es doméstico.
     */
    public Gato(String nombre, int edad, double peso, String dueno, boolean esDomestico) {
        super(nombre, edad, peso, dueno);
        setEsDomestico(esDomestico);
    }

    /** @return Si el gato es doméstico o no. */
    public boolean esDomestico() {return this.esDomestico;}

    /** @param esDomestico Se asigna si el gato es doméstico o no. */
    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    /** El gato maúlla cuando se ejecuta este método */
    @Override
    public void emitirSonido() {
        System.out.println("El gato está maullando\n");
    }
}

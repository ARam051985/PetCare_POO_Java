package modelo.clinica;

/**
 * Representa los consultorios disponibles en la clínica.
 */

public class Consultorio {
    private int numero;

    /**
     * Constructor para crear un consultorio con su número identificador.
     *
     * @param numero Número identificador del consultorio.
     */
    public Consultorio(int numero) {
        setNumero(numero);
    }

    /** @return El número del consultorio. */
    public int getNumero() {return this.numero;}

    /**
     * @param numero Número del consultorio a asignar.
     * @throws IllegalArgumentException si el número es menor o igual a cero.
     */
    public void setNumero(int numero) {
        if(numero <= 0) {
            throw new IllegalArgumentException("Número de consultorio no válido");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Consultorio #: " + numero;
    }
}

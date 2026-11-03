package modelo.mascotas;

/**
 * Clase concreta para definir los atributos del perro.
 */

public class Perro extends Mascota {
    private String raza;
    private int nivelEnergia;

    /**
     * Constructor para inicializar los datos generales del perro.
     *
     * @param nombre Nombre del perro.
     * @param edad Edad del perro en años.
     * @param peso Peso del perro en kilogramos.
     * @param dueno Nombre del dueño responsable.
     * @param raza Raza del perro.
     * @param nivelEnergia Porcentaje del nivel de energía del perro.
     */
    public Perro(String nombre, int edad, double peso, String dueno, String raza, int nivelEnergia) {
        super(nombre, edad, peso, dueno);
        setRaza(raza);
        setNivelEnergia(nivelEnergia);
    }

    /** @return Raza del perro. */
    public String getRaza() {return this.raza;}

    /** @return Nivel de energía del perro. */
    public int getNivelEnergia() {return this.nivelEnergia;}

    /** @param raza Nombre de la raza del perro a asignar. */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /** @param nivelEnergia Nivel de energía del perro a asignar. */
    public void setNivelEnergia(int nivelEnergia) {
        if(nivelEnergia <= 0 || nivelEnergia > 100) {
            throw new IllegalArgumentException("Nivel de energía no válido");
        }
        this.nivelEnergia = nivelEnergia;
    }

    /** El perro ladra cuando se ejecuta este método */
    @Override
    public void emitirSonido() {
        System.out.println("El perro está ladrando\n");
    }

    @Override
    public String toString() {
        return "Perro [" +
                "Datos: " + getDatosMascota() +
                ", Raza: " + raza +
                ", Nivel de energía: " + nivelEnergia +
                ']';
    }
}

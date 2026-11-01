package modelo.mascotas;

public class Gato extends Mascota implements EmitirSonido {
    private boolean esDomestico;

    public Gato(String nombre, int edad, double peso, String dueno, boolean esDomestico) {
        super(nombre, edad, peso, dueno);
        setEsDomestico(esDomestico);
    }

    public boolean esDomestico() {return this.esDomestico;}

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El gato está maullando");
    }
}

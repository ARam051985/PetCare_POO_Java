package modelo.mascotas;

public class AveExotica extends Mascota {
    private double longitudAlas;

    public AveExotica(String nombre, int edad, double peso, String dueno, double longitudAlas) {
        super(nombre, edad, peso, dueno);
        setLongitudAlas(longitudAlas);
    }

    public double getLongitudAlas() {return this.longitudAlas;}

    public void setLongitudAlas(double longitudAlas) {
        if(longitudAlas <= 0) {
            System.out.println("Longitud de alas no válida");
            return;
        }
        this.longitudAlas = longitudAlas;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El ave está cantando");
    }
}

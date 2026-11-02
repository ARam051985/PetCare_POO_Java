package modelo.mascotas;

public class Perro extends Mascota {
    private String raza;
    private int nivelEnergia;

    public Perro(String nombre, int edad, double peso, String dueno, String raza, int nivelEnergia) {
        super(nombre, edad, peso, dueno);
        setRaza(raza);
        setNivelEnergia(nivelEnergia);
    }

    public String getRaza() {return this.raza;}
    public int getNivelEnergia() {return  this.nivelEnergia;}

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNivelEnergia(int nivelEnergia) {
        if(nivelEnergia <= 0 || nivelEnergia > 100) {
            throw new IllegalArgumentException("Nivel de energía no válido");
        }
        this.nivelEnergia = nivelEnergia;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro está ladrando\n");
    }
}

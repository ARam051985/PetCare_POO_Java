package modelo.clinica;

public class Consultorio {
    private int numero;

    public Consultorio(int numero) {
        setNumero(numero);
    }

    public int getNumero() {return this.numero;}

    public void setNumero(int numero) {
        if(numero <= 0) {
            throw new IllegalArgumentException("Número de consultorio no válido");
        }
        this.numero = numero;
    }
}

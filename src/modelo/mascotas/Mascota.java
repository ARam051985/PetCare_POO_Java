package modelo.mascotas;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private double peso;
    private String dueno;

    public Mascota(String nombre, int edad, double peso, String dueno) {
        setDatosMascota(nombre, edad, peso, dueno);
    }

    public String getDatosMascota() {
        return "Nombre: " + nombre + ".\n" +
                "Edad: " + edad + ".\n" +
                "Peso: " + peso + ".\n" +
                "Dueño: " + dueno + ".\n";
    }

    public void setDatosMascota(String nombre, int edad, double peso, String dueno) {
        this.nombre = nombre;
        if(edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad de la mascota no válida");
        }

        if(peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso de la mascota no válida");
        }
        this.dueno = dueno;
    }
}

package app;

import modelo.mascotas.Mascota;
import modelo.mascotas.Perro;
import modelo.mascotas.Gato;
import modelo.mascotas.AveExotica;
import modelo.personas.Dueno;
import modelo.personas.Veterinario;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    static List<Dueno> listaDuenos = new ArrayList<>();
    static List<Mascota> listaMascotas = new ArrayList<>();

    public static void menu() {
        System.out.println("\n========== Clínica Veterinaria \"PetCare\" ==========");
        System.out.println("1. Registrar dueño y mascota (perro, gato o ave).");
        System.out.println("2. Registrar veterinario y asignarlo a la clínica.");
        System.out.println("3. Agendar una cita.");
        System.out.println("4. Atender o cancelar una cita.");
        System.out.println("5. Generar el comprobante de una cita atendida.");
        System.out.println("6. Consultar el historial clínico de una mascota.");
        System.out.println("7. Listar todas las mascotas y su sonido.");
        System.out.println("8. Ver el total cobrado por veterinario.");
        System.out.println("9. Dar de baja una mascota.");
        System.out.println("10. Salir.");
        System.out.print("Seleccione una opción: ");
    }

    public static void registrarDuenoMascota() {
        Scanner scanner = new Scanner(System.in);
        String nombreDueno;
        String apellidoDueno;
        String telefonoDueno;
        String correoDueno;
        String direccionDueno;
        int opcion = 0;
        String nombreMascota;
        int edadMascota;
        double pesoMascota = 0.0;

        String raza = "";
        int nivelEnergia = 0;

        boolean esDomestico = false;

        double longitudAlas = 0.0;

        System.out.print("Ingrese el nombre del dueño: ");
        nombreDueno = scanner.nextLine();

        System.out.print("Ingrese el apellido del dueño: ");
        apellidoDueno = scanner.nextLine();

        System.out.print("Ingrese el número de teléfono del dueño: ");
        telefonoDueno = scanner.nextLine();

        System.out.print("Ingrese el correo del dueño: ");
        correoDueno = scanner.nextLine();

        System.out.print("Ingrese la dirección del dueño: ");
        direccionDueno = scanner.nextLine();

        do {
            System.out.println("¿Cuál es la mascota?");
            System.out.println("1. Perro");
            System.out.println("2. Gato");
            System.out.println("3. Ave exótica");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
            } catch (Exception excepcion) {
            }
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    System.out.print("Ingress la raza del perro: ");
                    raza = scanner.nextLine();

                    System.out.print("Ingress el nivel de energía del perro: ");
                    nivelEnergia = scanner.nextInt();
                    break;
                case 2:
                    int opcionEsDomestico = 0;
                    System.out.println("¿El gato es doméstico?\n1. Sí\n2. No");

                    do {
                        System.out.print("Seleccione una opción: ");
                        try {
                            opcionEsDomestico = scanner.nextInt();
                        } catch(Exception excepcion) {
                            System.out.println("Opción no válida");
                            scanner.nextLine();
                        }
                    } while(opcionEsDomestico < 1 || opcionEsDomestico > 2);
                    scanner.nextLine();

                    if(opcionEsDomestico == 1) {
                        esDomestico = true;
                    } else {
                        esDomestico = false;
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la longitud de alas del ave: ");
                    longitudAlas = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while(opcion <= 0 || opcion > 3);
        scanner.nextLine();

        System.out.print("Ingrese el nombre de la mascota: ");
        nombreMascota = scanner.nextLine();

        System.out.print("Ingrese la edad de la mascota: ");
        edadMascota = scanner.nextInt();

        System.out.print("Ingrese el peso de la mascota: ");
        pesoMascota = scanner.nextDouble();

        Dueno dueno = new Dueno(nombreDueno, apellidoDueno, telefonoDueno, correoDueno, direccionDueno);
        listaDuenos.add(dueno);

        Mascota mascotaNueva = null;
        if(opcion == 1) {
            mascotaNueva = new Perro(nombreMascota, edadMascota, pesoMascota,
                    nombreDueno + " " + apellidoDueno, raza, nivelEnergia);
        } else if(opcion == 2) {
            mascotaNueva = new Gato(nombreMascota, edadMascota, pesoMascota,
                    nombreDueno + " " + apellidoDueno, esDomestico);
        } else if(opcion == 3) {
            mascotaNueva = new AveExotica(nombreMascota, edadMascota, pesoMascota,
                    nombreDueno + " " + apellidoDueno, longitudAlas);
        }

        if(mascotaNueva != null) {
            listaMascotas.add(mascotaNueva);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            menu();
            try {
                opcion = scanner.nextInt();
            } catch(Exception excepcion) {

            }
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    registrarDuenoMascota();
                    System.out.println("Dueño y mascota registrados con éxito");
                    break;
                case 2:
                    System.out.println("2. Registrar veterinario y asignarlo a la clínica.");
                    break;
                case 3:
                    System.out.println("3. Agendar una cita.");
                    break;
                case 4:
                    System.out.println("4. Atender o cancelar una cita.");
                    break;
                case 5:
                    System.out.println("5. Generar el comprobante de una cita atendida.");
                    break;
                case 6:
                    System.out.println("6. Consultar el historial clínico de una mascota.");
                    break;
                case 7:
                    System.out.println("7. Listar todas las mascotas y su sonido.");
                    break;
                case 8:
                    System.out.println("8. Ver el total cobrado por veterinario.");
                    break;
                case 9:
                    System.out.println("9. Dar de baja una mascota.");
                    break;
                case 10:
                    System.out.println("Saliste del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 10);

        scanner.close();
        System.out.println("¡Que tenga un buen día!");
    }
}

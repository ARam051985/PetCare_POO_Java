package app;

import modelo.clinica.Cita;
import modelo.clinica.Consultorio;
import modelo.mascotas.*;
import modelo.personas.Dueno;
import modelo.personas.Veterinario;
import modelo.servicios.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    static List<Dueno> listaDuenos = new ArrayList<>();
    static List<Mascota> listaMascotas = new ArrayList<>();
    static List<Veterinario> listaVeterinarios = new ArrayList<>();
    static List<Consultorio> listaConsultorios = new ArrayList<>();
    static List<Cita> listaCitas = new ArrayList<>();

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
        int opcion = 0;

        String raza = "";
        int nivelEnergia = 0;
        boolean esDomestico = false;
        double longitudAlas = 0.0;

        System.out.print("Ingrese el nombre del dueño: ");
        String nombreDueno = scanner.nextLine();

        System.out.print("Ingrese el apellido del dueño: ");
        String apellidoDueno = scanner.nextLine();

        System.out.print("Ingrese el número de teléfono del dueño: ");
        String telefonoDueno = scanner.nextLine();

        System.out.print("Ingrese el correo del dueño: ");
        String correoDueno = scanner.nextLine();

        System.out.print("Ingrese la dirección del dueño: ");
        String direccionDueno = scanner.nextLine();

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
        String nombreMascota = scanner.nextLine();

        System.out.print("Ingrese la edad de la mascota: ");
        int edadMascota = scanner.nextInt();

        System.out.print("Ingrese el peso de la mascota: ");
        double pesoMascota = scanner.nextDouble();

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

    public static void registrarVeterinario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del veterinario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del veterinario: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el teléfono del veterinario: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese el correo del veterinario: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese la cédula profesional: ");
        String cedulaProfesional = scanner.nextLine();

        System.out.print("Ingrese la especialidad: ");
        String especialidad = scanner.nextLine();

        Veterinario veterinario = new Veterinario(nombre, apellido, telefono, correo,
                cedulaProfesional, especialidad);

        listaVeterinarios.add(veterinario);
    }

    public static void agendarCita() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLista de mascotas");
        for(int i = 0; i < listaMascotas.size(); i++) {
            System.out.println((i + 1) + ". " + listaMascotas.get(i).getDatosMascota());
        }
        System.out.print("Seleccione el número de la mascota: ");
        int indiceMascota = scanner.nextInt() - 1;
        Mascota mascotaSeleccionada = listaMascotas.get(indiceMascota);

        System.out.println("\nLista de veterinarios");
        for (int i = 0; i < listaVeterinarios.size(); i++) {
            System.out.println((i + 1) + ". " + listaVeterinarios.get(i).getDatosPersonales());
        }
        System.out.print("Seleccione el número del veterinario: ");
        int indiceVeterinario = scanner.nextInt() - 1;
        Veterinario veterinarioSeleccionado = listaVeterinarios.get(indiceVeterinario);

        System.out.println("\nLista de consultorios");
        for (int i = 0; i < listaConsultorios.size(); i++) {
            System.out.println((i + 1) + ". Consultorio #: " + listaConsultorios.get(i).getNumero());
        }
        System.out.print("Seleccione el número del consultorio: ");
        int indiceConsultorio = scanner.nextInt() - 1;
        Consultorio consultorioSeleccionado = listaConsultorios.get(indiceConsultorio);
        scanner.nextLine();

        System.out.println("\nServicios");
        System.out.println("1. Consulta General");
        System.out.println("2. Vacunación");
        System.out.println("3. Cirugía");
        System.out.print("Seleccione una opción: ");
        int tipoServicio = scanner.nextInt();
        scanner.nextLine();

        Servicio servicioSeleccionado = null;
        if(tipoServicio == 1) {
            ConsultaEstandar consultaEstandar = new ConsultaEstandar();
            servicioSeleccionado = consultaEstandar;
            System.out.println("Se ha seleccionado Consulta General (Tarifa base aplicada).");
        } else if(tipoServicio == 2) {
            System.out.print("Ingrese el costo de la vacuna: ");
            double costoVacuna = scanner.nextDouble();
            scanner.nextLine();

            Vacunacion vacunacion = new Vacunacion();
            vacunacion.setCostoVacuna(costoVacuna);
            servicioSeleccionado = vacunacion;
        } else if(tipoServicio == 3) {
            System.out.print("Ingrese la tarifa por hora del quirófano:");
            double tarifaPorHora = scanner.nextDouble();
            System.out.print("Ingrese el nivel de complejidad (del 1 al 5): ");
            int complejidad = scanner.nextInt();
            System.out.print("Ingrese las horas de quirófano: ");
            int horas = scanner.nextInt();
            scanner.nextLine();

            Cirugia cirugia = new Cirugia();
            cirugia.setTarifaPorHora(tarifaPorHora);
            cirugia.setNivelComplejidad(complejidad);
            cirugia.setHorasQuirofano(horas);
            servicioSeleccionado = cirugia;
        }

        System.out.print("Ingrese el año de la cita: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese el mes (del 1 al 12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el día (del 1 al 31): ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        int minuto = scanner.nextInt();
        scanner.nextLine();

        LocalDateTime fechaHoraIngresada = LocalDateTime.of(anio, mes, dia, hora, minuto);

        Cita nuevaCita = new Cita(mascotaSeleccionada,
                veterinarioSeleccionado,
                consultorioSeleccionado,
                servicioSeleccionado,
                fechaHoraIngresada,
                modelo.clinica.EstadoCita.PROGRAMADA);
        listaCitas.add(nuevaCita);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consultorio consultorio1 = new Consultorio(1);
        Consultorio consultorio2 = new Consultorio(2);
        Consultorio consultorio3 = new Consultorio(3);
        listaConsultorios.add(consultorio1);
        listaConsultorios.add(consultorio2);
        listaConsultorios.add(consultorio3);
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
                    registrarVeterinario();
                    System.out.println("Veterinario registrado con éxito");
                    break;
                case 3:
                    if(listaMascotas.isEmpty() || listaVeterinarios.isEmpty()) {
                        System.out.println("No hay mascotas ni veterinarios." +
                                "\nRegístrelos para utilizar esta opción");
                    } else {
                        agendarCita();
                        System.out.println("Cita agendada correctamente");
                    }
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

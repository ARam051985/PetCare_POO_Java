package app;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Registrar dueño y mascota (perro, gato o ave).");
        System.out.println("2. Registrar veterinario y asignarlo a la clínica.");
        System.out.println("3. Agendar una cita.");
        System.out.println("4. Atender o cancelar una cita.");
        System.out.println("5. Generar el comprobante de una cita atendida.");
        System.out.println("6. Consultar el historial clínico de una mascota.");
        System.out.println("7. Listar todas las mascotas y su sonido.");
        System.out.println("8. Ver el total cobrado por veterinario.");
        System.out.println("9. Dar de baja una mascota.");
        System.out.println("10.Salir.");
        System.out.print("Seleccione una opción: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            menu();
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("1. Registrar dueño y mascota (perro, gato o ave).\n");
                    break;
                case 2:
                    System.out.println("2. Registrar veterinario y asignarlo a la clínica.\n");
                    break;
                case 3:
                    System.out.println("3. Agendar una cita.\n");
                    break;
                case 4:
                    System.out.println("4. Atender o cancelar una cita.\n");
                    break;
                case 5:
                    System.out.println("5. Generar el comprobante de una cita atendida.\n");
                    break;
                case 6:
                    System.out.println("6. Consultar el historial clínico de una mascota.\n");
                    break;
                case 7:
                    System.out.println("7. Listar todas las mascotas y su sonido.\n");
                    break;
                case 8:
                    System.out.println("8. Ver el total cobrado por veterinario.\n");
                    break;
                case 9:
                    System.out.println("9. Dar de baja una mascota.\n");
                    break;
                case 10:
                    System.out.println("Saliste del programa...");
                    break;
                default:
                    System.out.println("Opción no válida\n");
            }
        } while(opcion != 10);

        System.out.println("¡Que tenga un buen día!");
    }
}

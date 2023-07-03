import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el nombre del mes
        System.out.print("Ingrese el nombre del mes (en minúsculas): ");
        String nombreMes = scanner.nextLine();

        // Determinar la cantidad de días del mes
        int cantidadDias;

        switch (nombreMes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            default:
                cantidadDias = -1; // Valor inválido para indicar un nombre de mes no reconocido
                break;
        }

        // Mostrar la cantidad de días del mes
        if (cantidadDias != -1) {
            System.out.println("El mes de " + nombreMes + " tiene " + cantidadDias + " días.");
        } else {
            System.out.println("El nombre del mes ingresado no es válido.");
        }

        scanner.close();
    }
}
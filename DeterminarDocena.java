import java.util.Scanner;

public class DeterminarDocena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Determinar a qué docena pertenece
        String docena;

        if (numero >= 1 && numero <= 12) {
            docena = "primer";
        } else if (numero >= 13 && numero <= 24) {
            docena = "segunda";
        } else if (numero >= 25 && numero <= 36) {
            docena = "tercer";
        } else {
            System.out.println("El numero " + numero + " esta fuera de rango");
            scanner.close();
            return;
        }

        // Mostrar el resultado
        System.out.println("El numero " + numero + " pertenece a la " + docena + " docena.");

        scanner.close();
    }
}
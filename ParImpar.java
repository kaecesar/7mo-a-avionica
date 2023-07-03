import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el numero
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        // Verificar si el numero es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par.");
        } else {
            System.out.println("El numero ingresado es impar.");
        }

        scanner.close();
    }
}

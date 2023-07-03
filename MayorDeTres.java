import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los valores de las variables
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero entero: ");
        int num3 = scanner.nextInt();

        // Determinar el mayor de los tres numeros
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        // Mostrar el numero mayor
        System.out.println("El numero mayor es: " + mayor);

        scanner.close();
    }
}

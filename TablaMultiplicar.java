import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el valor para la tabla de multiplicar
        System.out.print("Ingrese un valor para la tabla de multiplicar: ");
        int valor = scanner.nextInt();

        // Mostrar la tabla de multiplicar del valor ingresado
        System.out.println("Tabla de multiplicar del " + valor + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}

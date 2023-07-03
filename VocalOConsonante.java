import java.util.Scanner;

public class VocalOConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar un carácter
        System.out.print("Ingrese un caracter: ");
        char caracter = scanner.next().charAt(0);

        // Determinar si es una vocal o no
        boolean esVocal = (caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u');

        // Mostrar el resultado
        if (esVocal) {
            System.out.println("El caracter es una vocal");
        } else {
            System.out.println("El caracter es una consonante");
        }

        scanner.close();
    }
}

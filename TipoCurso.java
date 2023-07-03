import java.util.Scanner;

public class TipoCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el numero de curso
        System.out.print("Ingrese el numero de curso: ");
        int numeroCurso = scanner.nextInt();

        // Determinar el tipo de curso segun el numero ingresado
        String tipoCurso;

        if (numeroCurso == 0) {
            tipoCurso = "jardin de infantes";
        } else if (numeroCurso >= 1 && numeroCurso <= 6) {
            tipoCurso = "primaria";
        } else if (numeroCurso >= 7 && numeroCurso <= 12) {
            tipoCurso = "secundaria";
        } else {
            tipoCurso = "curso no reconocido";
        }

        // Mostrar el tipo de curso correspondiente
        System.out.println("El tipo de curso es: " + tipoCurso);

        scanner.close();
    }
}
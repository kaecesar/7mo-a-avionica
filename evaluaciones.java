import java.util.Scanner;

public class evaluaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar las calificaciones de las evaluaciones
        System.out.print("Ingrese la calificación de la primera evaluación: ");
        double evaluacion1 = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la segunda evaluación: ");
        double evaluacion2 = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tercera evaluación: ");
        double evaluacion3 = scanner.nextDouble();

        // Calcular el promedio de las evaluaciones
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        // Determinar si aprobó o no
        if (promedio >= 7) {
            System.out.println("El alumno aprobó.");
        } else {
            System.out.println("El alumno no aprobó.");
        }

        scanner.close();
    }
}
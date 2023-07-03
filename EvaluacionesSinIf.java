import java.util.Scanner;

public class EvaluacionesSinIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar las evaluaciones del alumno
        System.out.print("Ingrese la nota de la primera evaluación: ");
        int evaluacion1 = scanner.nextInt();

        System.out.print("Ingrese la nota de la segunda evaluación: ");
        int evaluacion2 = scanner.nextInt();

        System.out.print("Ingrese la nota de la tercera evaluación: ");
        int evaluacion3 = scanner.nextInt();

        // Calcular el promedio de las evaluaciones
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3.0;

        // Mostrar el resultado
        System.out.println("Promedio de las evaluaciones: " + promedio);

        // Determinar si el alumno aprobó o no
        boolean aprobo = false;

        switch ((int) promedio / 7) {
            case 1:
                aprobo = true;
                break;
            default:
                aprobo = false;
                break;
        }

        String mensaje = aprobo ? "El alumno aprobó." : "El alumno no aprobó.";
        System.out.println(mensaje);

        scanner.close();
    }
}

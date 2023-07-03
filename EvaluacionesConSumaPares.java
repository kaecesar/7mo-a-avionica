import java.util.Scanner;

public class EvaluacionesConSumaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar las evaluaciones del alumno
        System.out.print("Ingrese la nota de la primera evaluación: ");
        int evaluacion1 = scanner.nextInt();

        System.out.print("Ingrese la nota de la segunda evaluación: ");
        int evaluacion2 = scanner.nextInt();

        System.out.print("Ingrese la nota de la tercera evaluación: ");
        int evaluacion3 = scanner.nextInt();

        // Calcular la suma de los valores pares
        int sumaPares = 0;
        if (evaluacion1 % 2 == 0) {
            sumaPares += evaluacion1;
        }
        if (evaluacion2 % 2 == 0) {
            sumaPares += evaluacion2;
        }
        if (evaluacion3 % 2 == 0) {
            sumaPares += evaluacion3;
        }

        // Calcular el promedio de las evaluaciones
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3.0;

        // Mostrar el resultado
        System.out.println("Promedio de las evaluaciones: " + promedio);
        System.out.println("Suma de los valores pares: " + sumaPares);

        // Determinar si el alumno aprobó o no
        if (promedio >= 7) {
            System.out.println("El alumno aprobó.");
        } else {
            System.out.println("El alumno no aprobó.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar las jugadas de los competidores
        System.out.print("Jugador 1: ");
        int jugada1 = scanner.nextInt();

        System.out.print("Jugador 2: ");
        int jugada2 = scanner.nextInt();

        // Determinar el ganador
        String ganador;

        if (jugada1 == jugada2) {
            ganador = "Empate";
        } else if ((jugada1 == 0 && jugada2 == 2) || (jugada1 == 1 && jugada2 == 0) || (jugada1 == 2 && jugada2 == 1)) {
            ganador = "Jugador 1";
        } else {
            ganador = "Jugador 2";
        }

        // Mostrar el ganador
        System.out.println("El ganador es: " + ganador);

        scanner.close();
    }
}
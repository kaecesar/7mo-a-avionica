import java.util.Random;

public class NumerosAleatorios2 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        do {
            int numero = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
            System.out.println("Número generado: " + numero);

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}

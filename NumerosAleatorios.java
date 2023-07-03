import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int suma = 0;

        while (contador < 10) {
            int numero = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
            System.out.println("Número generado: " + numero);
            suma += numero;
            contador++;
        }

        double promedio = (double) suma / 10;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}

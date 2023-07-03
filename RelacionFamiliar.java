import java.util.Scanner;

public class RelacionFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la categoría
        System.out.print("Ingrese una categoria (a, b o c): ");
        String categoria = scanner.nextLine();

        // Determinar la relacion familiar según la categoría
        String relacion;

        switch (categoria) {
            case "a":
                relacion = "hijo";
                break;
            case "b":
                relacion = "padre";
                break;
            case "c":
                relacion = "abuelo";
                break;
            default:
                relacion = "categoria no reconocida";
                break;
        }

        // Mostrar la relación familiar correspondiente
        System.out.println("La relacion familiar es: " + relacion);

        scanner.close();
    }
}
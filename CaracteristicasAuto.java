public class CaracteristicasAuto {
    public static void main(String[] args) {
        char claseAuto = 'b'; // Cambiar el valor de la clase del auto aquí ('a', 'b' o 'c')

        // Mostrar las características del auto según su clase
        System.out.println("Características del auto:");

        if (claseAuto == 'a') {
            System.out.println("- Clase: A");
            System.out.println("- Ruedas: 4");
            System.out.println("- Motor: Sí");
        } else if (claseAuto == 'b') {
            System.out.println("- Clase: B");
            System.out.println("- Ruedas: 4");
            System.out.println("- Motor: Sí");
            System.out.println("- Cierre Centralizado: Sí");
            System.out.println("- Aire Acondicionado: Sí");
        } else if (claseAuto == 'c') {
            System.out.println("- Clase: C");
            System.out.println("- Ruedas: 4");
            System.out.println("- Motor: Sí");
            System.out.println("- Cierre Centralizado: Sí");
            System.out.println("- Aire Acondicionado: Sí");
            System.out.println("- Airbag: Sí");
        } else {
            System.out.println("Clase de auto no reconocida.");
        }
    }
}
public class TablasDeMultiplicar {
    public static void main(String[] args) {
        // Ciclo externo para las tablas del 1 al 10
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla + ":");

            // Ciclo interno para multiplicar el número de la tabla
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                int resultado = tabla * multiplicador;
                System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            }

            System.out.println(); // Separador entre tablas
        }
    }
}

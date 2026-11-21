/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 04: Reescribir sin atributos static
 * Enunciado: Sustituir tres atributos static por variables locales, parámetros y return.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

/*
 * Versión original con tres atributos static:
 *
 * public class Ej04_ReescribirSinStatic {
 *     static int cantidad = 3;
 *     static double precio = 2.75;
 *     static double total = 0;
 *
 *     static void calcularTotal() {
 *         total = cantidad * precio;
 *     }
 *
 *     public static void main(String[] args) {
 *         calcularTotal();
 *         System.out.printf("Total: $%.2f%n", total);
 *     }
 * }
 */
public class Ej04_ReescribirSinStatic {
    public static void main(String[] args) {
        int cantidad = 3;
        double precio = 2.75;
        double total = calcularTotal(cantidad, precio);

        System.out.printf("Total: $%.2f%n", total);
    }

    static double calcularTotal(int cantidad, double precio) {
        return cantidad * precio;
    }
}

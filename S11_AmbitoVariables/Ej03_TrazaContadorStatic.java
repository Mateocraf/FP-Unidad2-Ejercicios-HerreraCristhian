/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza del contador static
 * Enunciado: Trazar las variables y sus valores en un contador llamado desde un for.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej03_TrazaContadorStatic {
    static int contador = 0;

    static void registrar() {
        contador++;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            registrar();
            System.out.printf("Vuelta %d, contador %d%n", i, contador);
        }
        System.out.printf("Total: %d%n", contador);
    }

    /*
     * args permanece disponible en main y no cambia. El método registrar
     * accede a contador. La variable i sigue en main mientras dura la llamada.
     *
     * Línea | Variables vivas y en ámbito en esa línea | Valor
     * 10 | contador                                | contador = 0
     * 17  | contador, args, i                       | contador = 0, i = 1
     * 13  | contador                                | contador = 1
     * 19 | contador, args, i                       | contador = 1, i = 1
     * 17  | contador, args, i                       | contador = 1, i = 2
     * 13  | contador                                | contador = 2
     * 19 | contador, args, i                       | contador = 2, i = 2
     * 17  | contador, args, i                       | contador = 2, i = 3
     * 13  | contador                                | contador = 3
     * 19 | contador, args, i                       | contador = 3, i = 3
     * 17  | contador, args, i                       | contador = 3, i = 4 (condición falsa)
     * 21 | contador, args                          | contador = 3
     */
}

/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 01: Intercambiar primitivos
 * Enunciado: Intentar intercambiar dos variables int de main y explicar el resultado.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej01_IntercambiarPrimitivos {
    public static void main(String[] args) {
        int primero = 7;
        int segundo = 12;

        System.out.printf("Antes: %d, %d%n", primero, segundo);
        intercambiar(primero, segundo);
        System.out.printf("Despues: %d, %d%n", primero, segundo);
    }

    static void intercambiar(int a, int b) {
        int temporal = a;
        a = b;
        b = temporal;
        System.out.printf("Dentro del método: %d, %d%n", a, b);

        // En main siguen 7 y 12 porque a y b reciben copias de los valores.
        // El intercambio solo cambia esas copias dentro del método.
    }
}

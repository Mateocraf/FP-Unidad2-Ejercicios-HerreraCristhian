/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 05: Predicción de salida
 * Enunciado: Predecir la salida de un programa con tres llamadas y compararla con la salida real.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej05_PrediccionSalida {
    public static void main(String[] args) {
        int numero = 4;
        int[] valores = {4};

        aumentarNumero(numero);
        aumentarArreglo(valores);
        aumentarArreglo(valores);

        System.out.printf("Número en main: %d%n", numero);
        System.out.printf("Elemento en main: %d%n", valores[0]);
    }

    static void aumentarNumero(int numero) {
        numero = numero + 3;
        System.out.printf("Número en el método: %d%n", numero);
    }

    static void aumentarArreglo(int[] valores) {
        valores[0] = valores[0] + 3;
        System.out.printf("Elemento en el método: %d%n", valores[0]);
    }

    /*
     * Salida predicha:
     * Número en el método: 7
     * Elemento en el método: 7
     * Elemento en el método: 10
     * Número en main: 4
     * Elemento en main: 10
     *
     * El 4 de main se conserva porque el método modifica su copia.
     * El elemento del arreglo acumula dos incrementos: 4, 7 y 10.
     *
     * Salida real:
     * Número en el método: 7
     * Elemento en el método: 7
     * Elemento en el método: 10
     * Número en main: 4
     * Elemento en main: 10
     */
}

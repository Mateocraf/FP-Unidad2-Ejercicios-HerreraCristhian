/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 02: Intercambiar elementos de un arreglo
 * Enunciado: Intercambiar dos posiciones de un arreglo de enteros.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class Ej02_IntercambiarArreglo {
    public static void main(String[] args) {
        int[] numeros = {7, 4, 12};

        System.out.println("Antes: " + Arrays.toString(numeros));
        intercambiar(numeros, 0, 2);
        System.out.println("Después: " + Arrays.toString(numeros));
    }

    static void intercambiar(int[] v, int i, int j) {
        int temporal = v[i];
        v[i] = v[j];
        v[j] = temporal;

        // v recibe una copia de la referencia al mismo arreglo.
        // Escribir en v[i] y v[j] modifica los elementos que también ve main.
    }
}

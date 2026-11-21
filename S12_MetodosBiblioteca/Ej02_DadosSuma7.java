/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados que suman 7
 * Enunciado: Lanzar dos dados 1000 veces con Random y mostrar el conteo y el porcentaje de sumas iguales a 7.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {
    public static void main(String[] args) {
        Random azar = new Random();
        int lanzamientos = 1000;
        int vecesSiete = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = azar.nextInt(6) + 1;
            int dado2 = azar.nextInt(6) + 1;
            if (dado1 + dado2 == 7) {
                vecesSiete++;
            }
        }

        double porcentaje = vecesSiete * 100.0 / lanzamientos;
        System.out.printf("Lanzamientos: %d%n", lanzamientos);
        System.out.printf("Veces que sumaron 7: %d%n", vecesSiete);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}

/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 03: Aplicar descuento
 * Enunciado: Modificar todos los precios de un arreglo e imprimirlos antes y después.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej03_AplicarDescuento {
    public static void main(String[] args) {
        double[] precios = {25.0, 42.5, 60.0};

        System.out.println("Precios antes del descuento:");
        mostrarPrecios(precios);
        aplicarDescuento(precios, 20.0);
        System.out.println("Precios después del 20 % de descuento:");
        mostrarPrecios(precios);
    }

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - precios[i] * pct / 100.0;
        }
    }

    static void mostrarPrecios(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("$%.2f%n", precios[i]);
        }
    }
}

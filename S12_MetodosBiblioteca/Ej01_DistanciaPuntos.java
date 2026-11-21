/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 01: Distancia entre dos puntos
 * Enunciado: Calcular la distancia euclidiana entre dos puntos usando Math.sqrt y Math.pow.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej01_DistanciaPuntos {
    public static void main(String[] args) {
        double distancia = calcularDistancia(1.0, 2.0, 4.0, 6.0);

        System.out.printf("Distancia entre (1, 2) y (4, 6): %.2f%n", distancia);
    }

    static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;

        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
}

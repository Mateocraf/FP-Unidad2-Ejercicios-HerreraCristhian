/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 04: Sobrecarga de perímetro
 * Enunciado: Calcular el perímetro de un cuadrado y de un rectángulo con dos versiones de perimetro.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej04_SobrecargaPerimetro {
    public static void main(String[] args) {
        double cuadrado = perimetro(5.0);
        double rectangulo = perimetro(8.0, 3.0);

        System.out.printf("Perímetro del cuadrado: %.2f%n", cuadrado);
        System.out.printf("Perímetro del rectángulo: %.2f%n", rectangulo);
    }

    static double perimetro(double lado) {
        return 4 * lado;
    }

    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }
}

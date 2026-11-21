/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: Identificar las variables locales, de bloque y static en un ejemplo basado en E20_Ambito.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {
    static int llamadas = 0; // static: toda la clase.

    static int cuadrado(int n) { // n: parámetro local de cuadrado.
        llamadas++;
        int resultado = n * n; // Local de cuadrado.
        return resultado;
    }

    public static void main(String[] args) { // args: parámetro local de main.
        int suma = 0; // Local de main.
        int limite = 4; // Local de main.
        for (int i = 1; i <= limite; i++) { // De bloque: solo en el for.
            int valor = cuadrado(i); // De bloque: cuerpo del for.
            if (valor % 2 == 0) {
                String mensaje = "Cuadrado par"; // De bloque: solo en el if.
                System.out.printf("%s: %d%n", mensaje, valor);
            }
            suma += valor;
        }

        System.out.printf("Suma de cuadrados: %d%n", suma);
        System.out.printf("Llamadas: %d%n", llamadas);
    }
}

/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: Identificar errores de ámbito y registrar el mensaje del compilador y la causa.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {
    static int llamadas = 0;

    static int cuadrado(int n) {
        llamadas++;
        int resultado = n * n;
        return resultado;
    }

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 3; i++) {
            int valor = cuadrado(i);
            suma += valor;
        }

        // System.out.println(i);
        // javac: cannot find symbol (symbol: variable i).
        // Causa: i se declaró en el for y queda fuera de ámbito al cerrarlo.

        // System.out.println(valor);
        // javac: cannot find symbol (symbol: variable valor).
        // Causa: valor se declaró en el cuerpo del for y solo se puede usar allí.

        // System.out.println(resultado);
        // javac: cannot find symbol (symbol: variable resultado).
        // Causa: resultado es local de cuadrado y main recibe su valor por return.

        System.out.printf("Suma de cuadrados: %d%n", suma);
        System.out.printf("Llamadas: %d%n", llamadas);
    }
}

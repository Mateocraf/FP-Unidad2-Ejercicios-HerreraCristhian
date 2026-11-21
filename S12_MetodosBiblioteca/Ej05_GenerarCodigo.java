/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 05: Generar un código
 * Enunciado: Generar un código de seis caracteres con tres letras y tres dígitos aleatorios.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {
    public static void main(String[] args) {
        Random azar = new Random();
        String codigo = "";

        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + azar.nextInt(26));
            codigo = codigo + letra;
        }

        for (int i = 0; i < 3; i++) {
            int digito = azar.nextInt(10);
            codigo = codigo + digito;
        }

        System.out.println("Código generado: " + codigo);
    }
}

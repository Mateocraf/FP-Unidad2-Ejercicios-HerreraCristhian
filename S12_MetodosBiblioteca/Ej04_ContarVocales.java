/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: Contar vocales con String y Character, incluidas las mayúsculas y las vocales acentuadas.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej04_ContarVocales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        System.out.printf("Cantidad de vocales: %d%n", contarVocales(frase));
        entrada.close();
    }

    static int contarVocales(String frase) {
        String vocales = "aeiouáéíóúü";
        int cantidad = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (vocales.indexOf(letra) >= 0) {
                cantidad++;
            }
        }

        return cantidad;
    }
}

/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: Comprobar que tenga al menos ocho caracteres, una mayúscula y un dígito.
 * Autor: Herrera Cristhian
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej03_ValidarContrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una contraseña de prueba: ");
        String contrasena = entrada.nextLine();

        if (esValida(contrasena)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Debe tener al menos 8 caracteres, una mayúscula y un dígito.");
        }

        entrada.close();
    }

    static boolean esValida(String contrasena) {
        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }

        return contrasena.length() >= 8 && tieneMayuscula && tieneDigito;
    }
}

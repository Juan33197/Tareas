/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

/**
 *
 * @author desan
 */
import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int longitud = textoLimpio.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (textoLimpio.charAt(i) != textoLimpio.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String cadena = scanner.nextLine();
        
        if (esPalindromo(cadena)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        
        scanner.close();
    }
}

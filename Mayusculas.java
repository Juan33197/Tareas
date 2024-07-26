/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayusculas;

/**
 *
 * @author desan
 */
import java.util.Scanner;

public class Mayusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textoFinal = new StringBuilder();
        System.out.println("MAYUSCULAS");

        while (true) {
            System.out.print("Ingresa una palabra (varias palabras separadas por espacios para terminar): ");
            String entrada = scanner.nextLine();

            if (entrada.trim().contains(" ")) {
                break;
            }

            String entradaMayusculas = entrada.toUpperCase();
            if (textoFinal.length() > 0) {
                textoFinal.append(" ");
            }
            textoFinal.append(entradaMayusculas);
        }

        System.out.println(textoFinal.toString());
        scanner.close();
    }
}

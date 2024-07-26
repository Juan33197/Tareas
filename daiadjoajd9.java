/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.remplazarcaracter;

/**
 *
 * @author desan
 */
import java.util.Scanner;

public class daiadjoajd9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa el carácter que deseas reemplazar: ");
        char caracterAReemplazar = scanner.next().charAt(0);

        System.out.print("Ingresa el nuevo carácter: ");
        char nuevoCaracter = scanner.next().charAt(0);

        String textoModificado = texto.replace(caracterAReemplazar, nuevoCaracter);

        System.out.println("Texto modificado: " + textoModificado);

        scanner.close();
    }
}


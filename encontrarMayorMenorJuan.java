/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encontrarnumeromayor;

/**
 *
 * @author desan
 */
import java.util.Arrays;
import java.util.Scanner;

public class encontrarMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8]; // Array para almacenar los 8 números

        // Leer 8 números desde el teclado y almacenarlos en el array
        System.out.println("Ingresa 8 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Almacena el número en el array
        }

        // Encontrar el número mayor y el número menor usando Arrays
        int mayor = Arrays.stream(numeros).max().getAsInt();
        int menor = Arrays.stream(numeros).min().getAsInt();

        // Mostrar el número mayor y el número menor
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close(); // Cierra el scanner para liberar los recursos
    }
}

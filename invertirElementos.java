/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encontrarenteros;

/**
 *
 * @author desan
 */
import java.util.Arrays;
import java.util.Scanner;

public class invertirElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6]; // Array para almacenar los 6 números

        // Leer 6 números desde el teclado y almacenarlos en el array
        System.out.println("Ingresa 6 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Almacena el número en el array
        }

        // Mostrar el array original
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Invertir el orden de los elementos en el array
        int inicio = 0;
        int fin = numeros.length - 1;
        while (inicio < fin) {
            // Intercambiar los elementos
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temp;

            // Mover los índices
            inicio++;
            fin--;
        }

        // Mostrar el array invertido
        System.out.println("Array invertido: " + Arrays.toString(numeros));

        scanner.close(); // Cierra el scanner para liberar los recursos
    }
}

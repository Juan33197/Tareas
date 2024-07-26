/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumaelementos;

/**
 *
 * @author desan
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sumaelementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingresa 5 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); 
        }
        int suma = Arrays.stream(numeros).sum();

        System.out.println("La suma de los elementos es: " + suma);

        scanner.close(); 
    }

    @Override
    public String toString() {
        return "sumaElementos []";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bola;

/**
 *
 * @author desan
 */
import java.util.Scanner;

public class Bola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);

        scanner.close();
    }
}

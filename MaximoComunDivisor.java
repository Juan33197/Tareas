/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maximocomundivisor;

/**
 *
 * @author desan
 */
import java.util.Scanner;

public class MaximoComunDivisor {
    
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero entero: ");
        
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            System.out.print("Ingresa el segundo numero entero: ");
            
            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();
                int mcd = calcularMCD(num1, num2);
                System.out.println("El maximo comun divisor de " + num1 + " y " + num2 + " es: " + mcd);
            } else {
                System.out.println("El segundo numero esta mal.");
            }
        } else {
            System.out.println("El primer numero esta mal.");
        }
        
        scanner.close();
    }
}

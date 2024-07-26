package com.mycompany.primo;

import java.util.Scanner;

public class Primo {
    
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un numero: ");
        
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            boolean resultado = esPrimo(numero);
            if (resultado) {
                System.out.println("El numero " + numero + " es primo: " + true);
            } else {
                System.out.println("El numero " + numero + " no es primo: " + false);
            }
        } else {
            System.out.println("Por favor, usa la cabeza: " + false);
        }
        
        scanner.close();
    }
}

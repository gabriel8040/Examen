/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro_calculadora_vedoo;

/**
 *
 * @author gabriel
 */
import java.util.Scanner;

public class Pro_calculadora_vedoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = obtenerNumero(scanner);

        System.out.print("Introduce el segundo número: ");
        double num2 = obtenerNumero(scanner);

        System.out.println("Operaciones matemáticas con " + num1 + " y " + num2 + ":");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    private static double obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Error: Ingresa un número válido. Inténtalo de nuevo: ");
            }
        }
    }
}



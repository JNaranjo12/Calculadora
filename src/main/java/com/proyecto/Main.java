package com.proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("=== CALCULADORA ===");
        System.out.println("Operaciones disponibles:");
        System.out.println("  +   Suma (a + b)");
        System.out.println("  -   Resta (a - b)");
        System.out.println("  *   Multiplicación (a * b)");
        System.out.println("  /   División (a / b)");
        System.out.println("  ^   Potencia (a ^ b)");
        System.out.println("  √   Raíz cuadrada (√a)");
        System.out.println("  %   Módulo (a % b)");
        System.out.println("  abs Valor absoluto (|a|)");
        System.out.print("\nSeleccione una operación ingresando el símbolo correspondiente: ");
        String operacion = scanner.next();

        try {
            switch (operacion) {
                case "+" -> {
                    System.out.print("Ingrese el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.sumar(a, b));
                }
                case "-" -> {
                    System.out.print("Ingrese el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.restar(a, b));
                }
                case "*" -> {
                    System.out.print("Ingrese el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.multiplicar(a, b));
                }
                case "/" -> {
                    System.out.print("Ingrese el dividendo (a): ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el divisor (b): ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.dividir(a, b));
                }
                case "^" -> {
                    System.out.print("Ingrese la base (a): ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el exponente (b): ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.potencia(a, b));
                }
                case "√" -> {
                    System.out.print("Ingrese el número para calcular la raíz cuadrada: ");
                    double a = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.raiz(a));
                }
                case "%" -> {
                    System.out.print("Ingrese el primer número (a): ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número (b): ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.modulo(a, b));
                }
                case "abs" -> {
                    System.out.print("Ingrese el número para calcular el valor absoluto: ");
                    double a = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.absoluto(a));
                }
                default -> System.out.println(" Operación no válida. Reinicie el programa e intente de nuevo.");
            }
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }

        System.out.println("\nGracias por usar la calculadora. ¡Hasta pronto!");
        scanner.close();
    }
}
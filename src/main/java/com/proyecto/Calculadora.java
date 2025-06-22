package com.proyecto;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raiz(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede sacar raíz de un número negativo.");
        }
        return Math.sqrt(numero);
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public double absoluto(double numero) {
        return Math.abs(numero);
    }
}

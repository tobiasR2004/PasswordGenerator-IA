package org.example;

    public class Calculadora {

        // 1. Mejora: Definimos el mensaje como constante pública
        // Esto evita errores de tipeo en los tests y facilita traducciones futuras.
        public static final String ERROR_DIVISION_POR_CERO = "No se puede dividir por cero";

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
            // 2. Mejora: Validación más robusta para doubles
            // Si el valor absoluto de b es extremadamente pequeño, lo consideramos cero.
            if (Math.abs(b) < 0.0000001) {
                throw new ArithmeticException(ERROR_DIVISION_POR_CERO);
            }
            return a / b;
        }
    }
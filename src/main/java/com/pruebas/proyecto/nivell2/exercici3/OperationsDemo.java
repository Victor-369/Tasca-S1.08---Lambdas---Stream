package com.pruebas.proyecto.nivell2.exercici3;

public class OperationsDemo {
    public static final ArithmeticOperation ADD = (numberA, numberB) -> numberA + numberB;
    public static final ArithmeticOperation SUBTRACT = (numberA, numberB) -> numberA - numberB;
    public static final ArithmeticOperation MULTIPLY = (numberA, numberB) -> numberA * numberB;
    public static final ArithmeticOperation DIVIDE = (numberA, numberB) -> {
        if (numberB == 0) {
            throw new IllegalArgumentException("The divisor must not be zero");
        }
        return numberA / numberB;
    };

    public static void main(String[] args) {
        calculateAndPrintResult(ADD, 3, 3);
        calculateAndPrintResult(SUBTRACT, 3, 5);
        calculateAndPrintResult(MULTIPLY, 3, 4);
        calculateAndPrintResult(DIVIDE, 3, 2);
    }

    public static void calculateAndPrintResult(ArithmeticOperation operation, float numberA, float numberB) {
        System.out.println(calculateResult(operation, numberA, numberB));
    }

    public static float calculateResult(ArithmeticOperation operation, float numberA, float numberB) {
        return operation.operation(numberA, numberB);
    }
}

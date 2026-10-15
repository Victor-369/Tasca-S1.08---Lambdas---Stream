package com.pruebas.proyecto.nivell2.exercici3;

public class OperationsDemo {
    public static void main(String[] args) {
        calculateAndPrintResult("add", 3, 3);
        calculateAndPrintResult("subtract", 3, 5);
        calculateAndPrintResult("multiply", 3, 4);
        calculateAndPrintResult("divide", 3, 2);
    }

    public static void calculateAndPrintResult(String operator, float numberA, float numberB) {
        ArithmeticOperation arithmeticOperation = (oper, operandA, operandB) -> {
            float result = 0;
            switch (oper) {
                case "add" -> result = operandA + operandB;
                case "subtract" -> result = operandA - operandB;
                case "multiply" -> result = operandA * operandB;
                case "divide" -> {
                    checkZeroValue(operandB);
                    result = operandA / operandB;
                }
            }

            return result;
        };

        System.out.println(arithmeticOperation.operation(operator, numberA, numberB));
    }

    private static void checkZeroValue(float operandB) {
        if (operandB == 0) throw new IllegalArgumentException("Value must be positive");
    }
}

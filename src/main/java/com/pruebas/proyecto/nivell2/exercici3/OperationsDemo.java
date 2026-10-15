package com.pruebas.proyecto.nivell2.exercici3;

public class OperationsDemo {
    public static void main(String[] args) {
        calculateAndPrintResult("add", 3, 3);
        calculateAndPrintResult("subtract", 3, 5);
        calculateAndPrintResult("multiply", 3, 4);
        calculateAndPrintResult("divide", 3, 2);
    }

    public static void calculateAndPrintResult(String operator, float numberA, float numberB) {
        System.out.println(calculateResult(operator, numberA, numberB));
    }

    public static float calculateResult(String operator, float numberA, float numberB) {
        ArithmeticOperation arithmeticOperation = (oper, operandA, operandB) ->
                switch (oper) {
                    case "add" -> operandA + operandB;
                    case "subtract" -> operandA - operandB;
                    case "multiply" -> operandA * operandB;
                    case "divide" -> {
                        if (operandB == 0) {
                            throw new IllegalArgumentException("The divisor must not be zero");
                        }

                        yield operandA / operandB;
                    }
                    default -> throw new IllegalArgumentException("Unsupported operator: " + oper);
                };

        return arithmeticOperation.operation(operator, numberA, numberB);
    }
}

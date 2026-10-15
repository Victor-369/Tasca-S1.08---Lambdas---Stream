package com.pruebas.proyecto.nivell1.exercici8;

public class Main {
    public static void main(String[] args) {
        reverseAndPrint("Hello");
    }

    public static void reverseAndPrint(String input) {
        StringReverser reverser = (inputString) -> {
            StringBuilder reversedString = new StringBuilder();
            int lastIndex = inputString.length() - 1;
            for (int i = lastIndex; i >= 0; i--) {
                reversedString.append(inputString.charAt(i));
            }

            return reversedString.toString();
        };

        System.out.println(reverser.reverse(input));
    }
}

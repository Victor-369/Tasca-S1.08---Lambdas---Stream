package com.pruebas.proyecto.nivell2.exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumberFormatter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 6, 45, 77, 98);

        System.out.println(formatNumbers(numbers));
    }

    public static String formatNumbers(List<Integer> integers) {
        return integers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o") + number)
                .collect(Collectors.joining(", "));
    }
}

package com.pruebas.proyecto.nivell2.exercici4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringListSortingAndFiltering {
    private static final List<String> MIXED_VALUES = List.of(
            "pear", "apple", "banana", "kiwi", "7", "12", "orange"
    );

    public static void main(String[] args) {
        System.out.println("Sorted by first character: " + sortByFirstCharacter(MIXED_VALUES));
        System.out.println("Values containing 'e' first: " + sortWithEFirst(MIXED_VALUES));

        List<String> modifiedValues = new ArrayList<>(MIXED_VALUES);
        replaceAWithFour(modifiedValues);
        System.out.println("After replacing 'a' with '4': " + modifiedValues);
        System.out.println("Numeric strings: " + filterNumericStrings(MIXED_VALUES));
    }

    public static List<String> sortByFirstCharacter(List<String> mixedValues) {
        return mixedValues.stream()
                .sorted(Comparator.comparingInt(value -> value.charAt(0)))
                .toList();
    }

    public static List<String> sortWithEFirst(List<String> mixedValues) {
        return mixedValues.stream()
                .sorted((first, second) -> Boolean.compare(
                        !first.contains("e"),
                        !second.contains("e")
                ))
                .toList();
    }

    public static void replaceAWithFour(List<String> mixedValues) {
        mixedValues.replaceAll(value -> value.replace('a', '4'));
    }

    public static List<String> filterNumericStrings(List<String> mixedValues) {
        return mixedValues.stream()
                .filter(value -> value.matches("[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)(?:[eE][+-]?\\d+)?"))
                .toList();
    }
}

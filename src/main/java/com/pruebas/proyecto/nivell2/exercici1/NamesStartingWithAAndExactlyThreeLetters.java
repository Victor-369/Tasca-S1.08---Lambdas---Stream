package com.pruebas.proyecto.nivell2.exercici1;

import java.util.Arrays;
import java.util.List;

public class NamesStartingWithAAndExactlyThreeLetters {
    static void main(String[] args) {
        List<String> names = Arrays.asList(
                "alf", "Amy", "Ann", "Ada", "Ava",
                "Archie", "Arthur", "Oliver", "Harry",
                "George", "Jack", "Leo", "Ben", "Eve",
                "Ian", "Max", "Tom", "Joe", "Eva", "Alex"
        );

        List<String> matchingNames = getNamesStartingWithAAndExactlyThreeLetters(names);
        System.out.println(matchingNames);
    }

    public static List<String> getNamesStartingWithAAndExactlyThreeLetters(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .toList();
    }
}

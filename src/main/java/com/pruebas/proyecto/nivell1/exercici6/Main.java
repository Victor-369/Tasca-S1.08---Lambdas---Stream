package com.pruebas.proyecto.nivell1.exercici6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedValues = List.of("house", 10, "computer", 4, "city", 80);

        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(mixedValues);
        System.out.println(organizer.getStringsOrderedByLengthThenNumbers());
    }
}

package com.pruebas.proyecto.nivell1.exercici7;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedValues = List.of("house", 10, "computer", 4, "city", 80);

        StringsAndNumbersOrganizerReversed organizer = new StringsAndNumbersOrganizerReversed(mixedValues);
        System.out.println(organizer.getStringsReversedOrderedByLengthThenNumbers());
    }
}

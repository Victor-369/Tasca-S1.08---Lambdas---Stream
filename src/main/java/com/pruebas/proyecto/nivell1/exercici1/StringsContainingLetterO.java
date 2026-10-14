package com.pruebas.proyecto.nivell1.exercici1;

import java.util.ArrayList;
import java.util.List;

public class StringsContainingLetterO {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Hello", "Two", "Eleven", "Building", "Holidays", "Smartphone"));

        List<String> stringsContainingLetterO = getStringsContainingLetterO(strings);
        System.out.println(stringsContainingLetterO);

    }


    public static List<String> getStringsContainingLetterO(List<String> strings) {
        return strings.stream()
                .filter(string -> string.toLowerCase().contains("o"))
                .toList();
    }
}

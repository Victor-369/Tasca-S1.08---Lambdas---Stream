package com.pruebas.proyecto.nivell1.exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        List<String> strings = new ArrayList<>(List.of("Hello", "Two", "Eleven", "Building", "Holidays", "Smartphone"));
        StringsWithOAndMoreThanFiveLetters stringsWithOAndMoreThanFiveLetters = new StringsWithOAndMoreThanFiveLetters(strings);

        List<String> listStrings = stringsWithOAndMoreThanFiveLetters.getStringsContainingLetterO();
        System.out.println(listStrings);
    }
}

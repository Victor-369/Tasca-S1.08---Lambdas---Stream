package com.pruebas.proyecto.nivell1.exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        List<String> strings = new ArrayList<>(List.of("Hello", "Two", "Eleven", "Building", "Holidays", "Smartphone"));
        StringsContainingLetterO stringsContainingLetterO = new StringsContainingLetterO(strings);

        List<String> listStrings = stringsContainingLetterO.getStringsContainingLetterO();
        System.out.println(listStrings);
    }
}

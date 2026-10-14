package com.pruebas.proyecto.nivell1.exercici1;

import java.util.List;

public class StringsContainingLetterO {
    private List<String> listStrings;

    public StringsContainingLetterO(List<String> listString) {
        this.listStrings = listString;
    }

    public List<String> getStringsContainingLetterO() {
        return listStrings.stream()
                .filter(string -> string.toLowerCase().contains("o"))
                .toList();
    }
}

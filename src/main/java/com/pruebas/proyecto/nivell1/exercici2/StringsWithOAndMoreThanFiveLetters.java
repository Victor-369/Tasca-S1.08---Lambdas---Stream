package com.pruebas.proyecto.nivell1.exercici2;


import com.pruebas.proyecto.nivell1.exercici1.StringsContainingLetterO;

import java.util.List;

public class StringsWithOAndMoreThanFiveLetters extends StringsContainingLetterO {
    public StringsWithOAndMoreThanFiveLetters(List<String> listString) {
        super(listString);
    }

    @Override
    public List<String> getStringsContainingLetterO() {
        return super.getListStrings().stream()
                .filter(string -> string.toLowerCase().contains("o"))
                .filter(string -> string.length() > 5)
                .toList();
    }
}

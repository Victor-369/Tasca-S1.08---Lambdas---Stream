package com.pruebas.proyecto.nivell1.exercici6;

import java.util.ArrayList;
import java.util.List;

public class StringsAndNumbersOrganizer {
    private final List<Object> values;

    public StringsAndNumbersOrganizer(List<Object> values) {
        this.values = values;
    }

    public List<Object> getStringsOrderedByLengthThenNumbers() {
        List<Object> numbers = values.stream()
                .filter(Number.class::isInstance)
                .toList();

        List<Object> stringsByLength = values.stream()
                .filter(String.class::isInstance)
                .sorted((a, b) -> Integer.compare(
                        ((String) a).length(),
                        ((String) b).length())
                )
                .toList();

        List<Object> orderedValues = new ArrayList<>();
        orderedValues.addAll(stringsByLength);
        orderedValues.addAll(numbers);

        return orderedValues;
    }
}

package com.pruebas.proyecto.nivell1.exercici6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StringsAndNumbersOrganizer {
    private final List<Object> values;

    public StringsAndNumbersOrganizer(List<Object> values) {
        this.values = values;
    }

    public List<Object> getStringsOrderedByLengthThenNumbers() {
        List<Object> strings = values.stream()
                .filter(String.class::isInstance)
                .sorted((first, second) -> first.toString().compareTo(second.toString()))
                .toList();

        List<Object> numbers = values.stream()
                .filter(Number.class::isInstance)
                .sorted((first, second) -> new BigDecimal(first.toString())
                        .compareTo(new BigDecimal(second.toString())))
                .toList();

        List<Object> orderedValues = new ArrayList<>(strings);
        orderedValues.addAll(numbers);
        return orderedValues;
    }
}

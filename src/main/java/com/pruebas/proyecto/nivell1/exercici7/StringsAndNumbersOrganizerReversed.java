package com.pruebas.proyecto.nivell1.exercici7;

import java.util.ArrayList;
import java.util.List;

public class StringsAndNumbersOrganizerReversed {
    private final List<Object> values;

    public StringsAndNumbersOrganizerReversed(List<Object> values) {
        this.values = values;
    }

    public List<Object> getStringsReversedOrderedByLengthThenNumbers() {
        List<Object> numbers = values.stream()
                .filter(Number.class::isInstance)
                .toList();

        List<Object> stringsByLength = values.stream()
                .filter(String.class::isInstance)
                .sorted((a, b) -> Integer.compare(
                        ((String) b).length(),
                        ((String) a).length())
                )
                .toList();

        List<Object> orderedValues = new ArrayList<>();
        orderedValues.addAll(stringsByLength);
        orderedValues.addAll(numbers);

        return orderedValues;
    }
}

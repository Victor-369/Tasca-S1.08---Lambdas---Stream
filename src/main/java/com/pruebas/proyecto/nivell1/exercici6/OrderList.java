package com.pruebas.proyecto.nivell1.exercici6;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private final List<Object> list;

    public OrderList(List<Object> list) {
        this.list = list;
    }

    public List<Object> getList() {
        return list;
    }

    public List<Object> getOrderedWords() {
        List<Object> onlyNumbers = list.stream()
                .filter(Number.class::isInstance)
                .toList();

        List<Object> onlyWordsOrdered = list.stream()
                .filter(String.class::isInstance)
                .sorted((a, b) -> Integer.compare(
                        ((String) a).length(),
                        ((String) b).length())
                )
                .toList();

        List<Object> finalListWithWordsAndNumbers = new ArrayList<>();
        finalListWithWordsAndNumbers.addAll(onlyWordsOrdered);
        finalListWithWordsAndNumbers.addAll(onlyNumbers);

        return finalListWithWordsAndNumbers;
    }
}

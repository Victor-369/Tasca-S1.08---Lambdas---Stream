package com.pruebas.proyecto.nivell1.exercici6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(List.of("house", 10, "computer", 4, "city", 80));

        OrderList newOrder = new OrderList(list);
        System.out.println(newOrder.getOrderedWords());
    }
}

package com.pruebas.proyecto.nivell1.exercici4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        List<String> months = new ArrayList<>(List.of("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"));

        months.forEach(System.out::println);
    }
}

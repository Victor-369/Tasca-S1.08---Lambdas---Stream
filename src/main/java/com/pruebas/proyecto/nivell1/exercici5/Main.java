package com.pruebas.proyecto.nivell1.exercici5;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        PiValue piValue = () -> 3.1415;

        System.out.println(piValue.getPiValue());
    }
}

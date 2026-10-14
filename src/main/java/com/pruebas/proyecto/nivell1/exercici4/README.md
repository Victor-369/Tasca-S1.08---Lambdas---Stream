# Level 1, Exercise 4: Printing the Months with a Method Reference

## Task

Print the months as in the previous exercise, but use a method reference.

## Solution

`Main.runProgram` creates a list of the twelve months in calendar order and prints each month on a separate line using `List.forEach` with the method reference `System.out::println`.

The output is:

```text
January
February
March
April
May
June
July
August
September
October
November
December
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici4.Main
```

Run the test suite from the project root with:

```bash
mvn test
```

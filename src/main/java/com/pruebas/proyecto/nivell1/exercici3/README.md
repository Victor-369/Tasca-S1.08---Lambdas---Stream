# Level 1, Exercise 3: Printing the Months with a Lambda

## Task

Create a list containing the names of the months of the year and print every element using a lambda.

## Solution

`Main.runProgram` creates a list of the twelve months in calendar order and uses `List.forEach` with a lambda to print each month on a separate line.

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
java -cp target/classes com.pruebas.proyecto.nivell1.exercici3.Main
```

## Tests

The JUnit test runs `Main` as a separate Java process and checks that it exits successfully and prints all twelve months in order.

Run the test suite from the project root with:

```bash
mvn test
```

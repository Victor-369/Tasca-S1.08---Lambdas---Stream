# Level 2, Exercise 3: Arithmetic Operations with a Lambda

## Task

Create a functional interface whose method accepts only two numbers and returns a `float`. Implement addition, subtraction, 
multiplication and division as separate lambda expressions.

## Solution

`ArithmeticOperation` accepts only `numberA` and `numberB`; it has no operator argument. `OperationsDemo` defines a separate 
lambda for each operation and passes the selected implementation to `calculateResult` or `calculateAndPrintResult`. 
Division by zero is reported with `IllegalArgumentException`.

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici3.OperationsDemo
```

## Tests

The JUnit tests cover all four arithmetic operations and division by zero. Run them from the project root with:

```bash
mvn test
```

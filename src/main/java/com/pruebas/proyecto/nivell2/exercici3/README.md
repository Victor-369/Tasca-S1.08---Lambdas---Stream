# Level 2, Exercise 3: Arithmetic Operations with a Lambda

## Task

Create a functional interface whose method returns a `float`. Use a lambda to provide an implementation that can perform addition, subtraction, multiplication and division.

## Solution

`ArithmeticOperation` is the functional interface used by `OperationsDemo`. Its lambda selects the requested arithmetic operation and returns the result. `calculateResult` performs the calculation, while `calculateAndPrintResult` prints it. Unsupported operators and division by zero are reported with `IllegalArgumentException`.

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici3.OperationsDemo
```

## Tests

The JUnit tests cover all four arithmetic operations, division by zero and unsupported operators. Run them from the project root with:

```bash
mvn test
```

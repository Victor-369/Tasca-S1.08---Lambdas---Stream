# Level 1, Exercise 5: A Functional Interface for Pi

## Task

Create a functional interface with a `getPiValue()` method that returns a `double`. In the main class, assign the value `3.1415` to an instance of the interface, invoke the method and print the result.

## Solution

`PiValue` is annotated with `@FunctionalInterface` and declares the single abstract method `getPiValue()`. `Main.runProgram` creates an instance using the lambda expression `() -> 3.1415`, calls the method and prints its value.

The output is:

```text
3.1415
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici5.Main
```

## Tests

The JUnit tests check that the functional interface returns `3.1415` and that running `Main` prints that value.

Run the test suite from the project root with:

```bash
mvn test
```

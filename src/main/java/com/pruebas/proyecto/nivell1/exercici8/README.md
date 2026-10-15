# Level 1, Exercise 8: Reversing a String with a Functional Interface

## Task

Create a functional interface with a `reverse()` method that accepts and returns a `String`. In the main class, implement the method with a lambda that returns the input string in reverse order, invoke it with a string, and check that the result is correct.

## Solution

`StringReverser` is a functional interface whose `reverse` method accepts and returns a `String`. `Main.reverseAndPrint` provides the implementation as a lambda, iterates through the input from its last character to its first, and prints the reversed string.

Running `Main` reverses `"Hello"` and prints:

```text
olleH
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici8.Main
```

## Tests

The JUnit tests check that `reverseAndPrint` prints the reversed input and handles an empty string.

Run the test suite from the project root with:

```bash
mvn test
```

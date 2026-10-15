# Level 2, Exercise 2: Even and Odd Number Formatter

## Task

Given a list of integers, return a comma-separated string in which each even number is prefixed with `e` and each odd number is prefixed with `o`. Print the result.

## Solution

`EvenOddNumberFormatter.formatNumbers` uses the Stream API to prefix each integer according to its parity and join the formatted values with a comma and a space. The method returns the resulting string, and the class's `main` method prints it.

With the sample numbers in `main`, the output is:

```text
o1, e4, e6, o45, o77, e98
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici2.EvenOddNumberFormatter
```

## Tests

The JUnit tests check that the method:

- prefixes even and odd integers correctly and preserves their order;
- returns an empty string for an empty list;
- handles negative integers and zero according to their parity.

Run the test suite from the project root with:

```bash
mvn test
```

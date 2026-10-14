# Level 1, Exercise 1: Strings Containing the Letter O

## Task

Given a list of strings, return all the strings that contain the letter `o` and print the result.

## Solution

`StringsContainingLetterO.getStringsContainingLetterO` uses the Stream API to filter the input list. It converts each string 
to lower case before checking for `o`, so strings containing either `o` or `O` are included. The method preserves the order of matching strings.

The `main` method demonstrates the solution with a sample list. Its output is:

```text
[Hello, Two, Holidays, Smartphone]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici1.StringsContainingLetterO
```

## Tests

The JUnit tests check that the method:

- returns matching strings containing lower-case or upper-case `o`;
- returns an empty list when there are no matches;
- returns an empty list when the input is empty.

Run the test suite from the project root with:

```bash
mvn test
```

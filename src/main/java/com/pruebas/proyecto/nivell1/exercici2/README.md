# Level 1, Exercise 2: Strings Containing O and More Than Five Letters

## Task

As in the previous exercise, return all strings that contain the letter `o`, but include only strings with more than five letters. Print the result.

## Solution

`StringsWithOAndMoreThanFiveLetters.getStringsContainingLetterO` uses the Stream API to apply both conditions to the input list. It converts each string to lower case when checking for `o`, so either `o` or `O` matches. The length condition is strictly greater than five. The result preserves the order of matching strings.

`Main` demonstrates the solution with a sample list. Its output is:

```text
[Holidays, Smartphone]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici2.Main
```

## Tests

The JUnit tests check that the method:

- returns strings containing lower-case or upper-case `o` only when they have more than five letters;
- returns an empty list when no strings meet both conditions;
- returns an empty list when the input is empty.

Run the test suite from the project root with:

```bash
mvn test
```

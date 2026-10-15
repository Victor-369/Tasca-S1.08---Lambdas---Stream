# Level 2, Exercise 1: Names Starting with A

## Task

Create a list of first names and return all names that start with an uppercase `A` and contain exactly three letters. Print the result.

## Solution

`NamesStartingWithAAndExactlyThreeLetters.getNamesStartingWithAAndExactlyThreeLetters` uses the Stream API to filter names by their first character and length. The returned list preserves the order of matching names. The class's `main` method demonstrates the filter and prints the matches.

With the sample names in `main`, the output is:

```text
[Amy, Ann, Ada, Ava]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici1.NamesStartingWithAAndExactlyThreeLetters
```

## Tests

The JUnit tests check that the method:

- returns names that start with uppercase `A` and have exactly three letters;
- excludes names that do not meet both conditions;
- returns an empty list for empty input.

Run the test suite from the project root with:

```bash
mvn test
```

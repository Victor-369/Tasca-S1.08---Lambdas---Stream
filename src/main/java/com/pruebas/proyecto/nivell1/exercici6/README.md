# Level 1, Exercise 6: Ordering Strings and Numbers

## Task

Create a list containing numbers and strings, then order the strings from shortest to longest.

## Solution

`StringsAndNumbersOrganizer.getStringsOrderedByLengthThenNumbers` uses the Stream API to separate strings from numbers. It sorts the strings by length in ascending order, then appends the numbers in their original order. The returned list contains the sorted strings followed by the numbers.

`Main` demonstrates the solution with this input:

```text
[house, 10, computer, 4, city, 80]
```

The output is:

```text
[city, house, computer, 10, 4, 80]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici6.Main
```

## Tests

The JUnit tests check that the method:

- sorts strings by length and places numbers at the end;
- sorts a list containing only strings;
- preserves the order of numbers when there are no strings;
- returns an empty list for empty input.

Run the test suite from the project root with:

```bash
mvn test
```

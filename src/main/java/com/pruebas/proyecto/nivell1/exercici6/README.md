# Level 1, Exercise 6: Ordering Strings and Numbers

## Task

Create a mixed list containing numbers and strings, sort the strings lexicographically and the numbers in ascending numeric order, 
and return the strings followed by the numbers.

## Solution

`StringsAndNumbersOrganizer.getStringsOrderedByLengthThenNumbers` separates strings from numbers with the Stream API. 
It sorts strings lexicographically and compares the numbers by numeric value (using their string representations to create `BigDecimal` values, rather than comparing them lexicographically). The result contains the sorted strings followed by the sorted numbers.

`Main` demonstrates the solution with this input:

```text
[house, 10, computer, 4, city, 80]
```

The output is:

```text
[city, computer, house, 4, 10, 80]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici6.Main
```

## Tests

The JUnit tests check that the method:

- sorts strings lexicographically and numbers numerically, then places numbers after the strings;
- sorts a list containing only strings;
- sorts a list containing only numbers;
- returns an empty list for empty input.

Run the test suite from the project root with:

```bash
mvn test
```

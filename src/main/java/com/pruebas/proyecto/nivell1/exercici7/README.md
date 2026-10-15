# Level 1, Exercise 7: Ordering Strings in Reverse

## Task

Using the list from the previous exercise, order the strings in reverse length order, from longest to shortest.

## Solution

`StringsAndNumbersOrganizerReversed.getStringsReversedOrderedByLengthThenNumbers` uses the Stream API to separate strings from numbers. It sorts the strings by length in descending order, then appends the numbers in their original order. The returned list contains the ordered strings followed by the numbers.

`Main` demonstrates the solution with this input:

```text
[house, 10, computer, 4, city, 80]
```

The output is:

```text
[computer, house, city, 10, 4, 80]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici7.Main
```

## Tests

The JUnit tests check that the method:

- sorts strings from longest to shortest and places numbers at the end;
- sorts a list containing only strings in descending length order;
- preserves the order of numbers when there are no strings;
- returns an empty list for empty input.

Run the test suite from the project root with:

```bash
mvn test
```

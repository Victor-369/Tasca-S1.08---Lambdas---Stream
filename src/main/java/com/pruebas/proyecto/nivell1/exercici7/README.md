# Level 1, Exercise 7: Ordering Strings in Reverse

## Task

Using the list from the previous exercise, order the strings by length from longest to shortest and the numbers numerically in descending order.

## Solution

`StringsAndNumbersOrganizerReversed.getStringsReversedOrderedByLengthThenNumbers` uses the Stream API to separate strings from numbers. 
It sorts the strings by length in descending order and the numbers by numeric value in descending order. The returned list contains 
the ordered strings followed by the ordered numbers.

`Main` demonstrates the solution with this input:

```text
[house, 10, computer, 4, city, 80]
```

The output is:

```text
[computer, house, city, 80, 10, 4]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici7.Main
```

## Tests

The JUnit tests check that the method:

- sorts strings from longest to shortest and numbers numerically in descending order at the end;
- sorts a list containing only strings in descending length order;
- sorts a list containing only numbers numerically in descending order;
- returns an empty list for empty input.

Run the test suite from the project root with:

```bash
mvn test
```

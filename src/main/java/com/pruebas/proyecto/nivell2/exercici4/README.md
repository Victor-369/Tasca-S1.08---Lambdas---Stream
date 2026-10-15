# Level 2, Exercise 4: String List Sorting and Filtering

## Task

Create a list containing text and numeric values, then sort and filter its elements. Sort once by the first character, and once with values containing `e` first. Replace every `a` with `4`, and display only values that are numeric strings.

## Solution

`StringListSortingAndFiltering` demonstrates each operation with the Stream API and lambdas:

- `sortByFirstCharacter` orders values by the numeric character code of their first character.
- `sortWithEFirst` puts values containing lowercase `e` before the others, with the comparator written directly as a lambda.
- `replaceAWithFour` updates the supplied mutable list in place.
- `filterNumericStrings` returns strings in integer, decimal or scientific notation, while keeping them as strings in the source list.

The sample output is:

```text
Sorted by first character: [12, 7, apple, banana, kiwi, orange, pear]
Values containing 'e' first: [pear, apple, orange, banana, kiwi, 7, 12]
After replacing 'a' with '4': [pe4r, 4pple, b4n4n4, kiwi, 7, 12, or4nge]
Numeric strings: [7, 12]
```

## Run

From the project root, compile the project and run the exercise:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici4.StringListSortingAndFiltering
```

## Tests

The JUnit tests cover sorting by first character, prioritising values containing `e`, in-place replacement of `a`, and filtering integer, decimal and scientific numeric strings. Run the test suite with:

```bash
mvn test
```

package nivell1.exercici7;

import com.pruebas.proyecto.nivell1.exercici7.StringsAndNumbersOrganizerReversed;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsAndNumbersOrganizerReversedTest {
    @Test
    void getStringsReversedOrderedByLengthThenNumbers_whenValuesContainStringsAndNumbers_ordersStringsLongestFirstAndNumbersDescendingAtTheEnd() {
        List<Object> inputValues = List.of("house", 10, "computer", 4, "city", 80);
        StringsAndNumbersOrganizerReversed organizer = new StringsAndNumbersOrganizerReversed(inputValues);

        List<Object> orderedValues = organizer.getStringsReversedOrderedByLengthThenNumbers();

        assertEquals(List.of("computer", "house", "city", 80, 10, 4), orderedValues);
    }

    @Test
    void getStringsReversedOrderedByLengthThenNumbers_whenValuesContainOnlyStrings_ordersFromLongestToShortest() {
        List<Object> inputValues = List.of("a", "elephant", "cat", "pear");
        StringsAndNumbersOrganizerReversed organizer = new StringsAndNumbersOrganizerReversed(inputValues);

        List<Object> orderedValues = organizer.getStringsReversedOrderedByLengthThenNumbers();

        assertEquals(List.of("elephant", "pear", "cat", "a"), orderedValues);
    }

    @Test
    void getStringsReversedOrderedByLengthThenNumbers_whenValuesContainOnlyNumbers_ordersThemNumerically() {
        List<Object> inputValues = List.of(7, 2.5, -3, 10, 4);
        StringsAndNumbersOrganizerReversed organizer = new StringsAndNumbersOrganizerReversed(inputValues);

        List<Object> orderedValues = organizer.getStringsReversedOrderedByLengthThenNumbers();

        assertEquals(List.of(10, 7, 4, 2.5, -3), orderedValues);
    }

    @Test
    void getStringsReversedOrderedByLengthThenNumbers_whenValuesAreEmpty_returnsEmptyList() {
        StringsAndNumbersOrganizerReversed organizer = new StringsAndNumbersOrganizerReversed(List.of());

        List<Object> orderedValues = organizer.getStringsReversedOrderedByLengthThenNumbers();

        assertEquals(List.of(), orderedValues);
    }
}

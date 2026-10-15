package nivell1.exercici6;

import com.pruebas.proyecto.nivell1.exercici6.StringsAndNumbersOrganizer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsAndNumbersOrganizerTest {
    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesContainStringsAndNumbers_ordersStringsAndPutsNumbersAtTheEnd() {
        List<Object> inputValues = List.of("pear", 7, "a", 2.5, "plum", "watermelon");
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(inputValues);

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of("a", "pear", "plum", "watermelon", 7, 2.5), orderedValues);
    }

    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesContainOnlyStrings_ordersFromShortestToLongest() {
        List<Object> inputValues = List.of("elephant", "a", "pear", "cat");
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(inputValues);

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of("a", "cat", "pear", "elephant"), orderedValues);
    }

    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesContainOnlyNumbers_preservesTheirOrder() {
        List<Object> inputValues = List.of(7, 2.5, -3);
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(inputValues);

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(inputValues, orderedValues);
    }

    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesAreEmpty_returnsEmptyList() {
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(List.of());

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of(), orderedValues);
    }
}

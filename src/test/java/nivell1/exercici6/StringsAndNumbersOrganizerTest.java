package nivell1.exercici6;

import com.pruebas.proyecto.nivell1.exercici6.StringsAndNumbersOrganizer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsAndNumbersOrganizerTest {
    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesContainStringsAndNumbers_ordersStringsAndNumbers() {
        List<Object> inputValues = List.of("pear", 7, "a", 2.5, "plum", "watermelon");
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(inputValues);

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of("a", "pear", "plum", "watermelon", 2.5, 7), orderedValues);
    }

    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesContainOnlyStrings_ordersByStringRepresentation() {
        List<Object> inputValues = List.of("elephant", "a", "pear", "cat");
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(inputValues);

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of("a", "cat", "elephant", "pear"), orderedValues);
    }

    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesContainOnlyNumbers_ordersThemNumerically() {
        List<Object> inputValues = List.of(7, 2.5, -3, 10, 4);
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(inputValues);

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of(-3, 2.5, 4, 7, 10), orderedValues);
    }

    @Test
    void getStringsOrderedByLengthThenNumbers_whenValuesAreEmpty_returnsEmptyList() {
        StringsAndNumbersOrganizer organizer = new StringsAndNumbersOrganizer(List.of());

        List<Object> orderedValues = organizer.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of(), orderedValues);
    }
}

package nivell1.exercici6;

import com.pruebas.proyecto.nivell1.exercici6.StringsAndNumbersOrganizer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsAndNumbersOrganizerTest {
    @Test
    void getOrderedWords_whenListContainsNumbersAndWords_ordersWordsAndPutsNumbersAtTheEnd() {
        List<Object> input = List.of("pear", 7, "a", 2.5, "plum", "watermelon");
        StringsAndNumbersOrganizer orderList = new StringsAndNumbersOrganizer(input);

        List<Object> result = orderList.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of("a", "pear", "plum", "watermelon", 7, 2.5), result);
    }

    @Test
    void getOrderedWords_whenListContainsOnlyWords_ordersFromShortestToLongest() {
        List<Object> input = List.of("elephant", "a", "pear", "cat");
        StringsAndNumbersOrganizer orderList = new StringsAndNumbersOrganizer(input);

        List<Object> result = orderList.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of("a", "cat", "pear", "elephant"), result);
    }

    @Test
    void getOrderedWords_whenListContainsOnlyNumbers_preservesNumbersInOrder() {
        List<Object> input = List.of(7, 2.5, -3);
        StringsAndNumbersOrganizer orderList = new StringsAndNumbersOrganizer(input);

        List<Object> result = orderList.getStringsOrderedByLengthThenNumbers();

        assertEquals(input, result);
    }

    @Test
    void getOrderedWords_whenListIsEmpty_returnsEmptyList() {
        StringsAndNumbersOrganizer orderList = new StringsAndNumbersOrganizer(List.of());

        List<Object> result = orderList.getStringsOrderedByLengthThenNumbers();

        assertEquals(List.of(), result);
    }
}

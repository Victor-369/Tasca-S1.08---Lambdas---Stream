package nivell2.exercici4;

import com.pruebas.proyecto.nivell2.exercici4.StringListSortingAndFiltering;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListSortingAndFilteringTest {
    @Test
    void sortByFirstCharacter_ordersMixedValuesByTheirFirstCharacterCode() {
        List<String> mixedValues = List.of("pear", "apple", "7", "banana");

        assertEquals(List.of("7", "apple", "banana", "pear"),
                StringListSortingAndFiltering.sortByFirstCharacter(mixedValues));
    }

    @Test
    void sortWithEFirst_placesValuesContainingLowercaseEBeforeTheRest() {
        List<String> mixedValues = List.of("kiwi", "pear", "apple", "banana");

        assertEquals(List.of("pear", "apple", "kiwi", "banana"),
                StringListSortingAndFiltering.sortWithEFirst(mixedValues));
    }

    @Test
    void replaceAWithFour_replacesEveryLowercaseAInTheSuppliedList() {
        List<String> mixedValues = new ArrayList<>(List.of("banana", "pear", "7"));

        StringListSortingAndFiltering.replaceAWithFour(mixedValues);

        assertEquals(List.of("b4n4n4", "pe4r", "7"), mixedValues);
    }

    @Test
    void filterNumericStrings_returnsIntegerDecimalAndScientificNumericStrings() {
        List<String> mixedValues = List.of("12", "pear", "-3", "4.5", "1e3", ".5", "007", "");

        assertEquals(List.of("12", "-3", "4.5", "1e3", ".5", "007"),
                StringListSortingAndFiltering.filterNumericStrings(mixedValues));
    }
}

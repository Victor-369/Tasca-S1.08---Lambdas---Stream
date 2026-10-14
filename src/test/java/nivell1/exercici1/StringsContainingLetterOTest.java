package nivell1.exercici1;

import com.pruebas.proyecto.nivell1.exercici1.StringsContainingLetterO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsContainingLetterOTest {
    @Test
    void getStringsContainingLetterO_whenStringsContainLowercaseOrUppercaseO_returnsMatchingStrings() {
        List<String> input = List.of("Hello", "WORLD", "Building", "Two");

        List<String> result = StringsContainingLetterO.getStringsContainingLetterO(input);

        assertEquals(List.of("Hello", "WORLD", "Two"), result);
    }

    @Test
    void getStringsContainingLetterO_whenNoStringsContainLetterO_returnsEmptyList() {
        List<String> input = List.of("Eleven", "Building", "Sky");

        List<String> result = StringsContainingLetterO.getStringsContainingLetterO(input);

        assertEquals(List.of(), result);
    }

    @Test
    void getStringsContainingLetterO_whenInputIsEmpty_returnsEmptyList() {
        List<String> input = List.of();

        List<String> result = StringsContainingLetterO.getStringsContainingLetterO(input);

        assertEquals(List.of(), result);
    }
}

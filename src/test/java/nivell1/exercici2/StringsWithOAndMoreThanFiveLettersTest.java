package nivell1.exercici2;

import com.pruebas.proyecto.nivell1.exercici2.StringsWithOAndMoreThanFiveLetters;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsWithOAndMoreThanFiveLettersTest {
    @Test
    void getStringsContainingLetterO_whenStringsContainOAndHaveMoreThanFiveLetters_returnsMatchingStrings() {
        List<String> input = List.of("October", "HORIZON", "Hello", "Building", "Two");

        StringsWithOAndMoreThanFiveLetters strings = new StringsWithOAndMoreThanFiveLetters(input);
        List<String> result = strings.getStringsContainingLetterO();

        assertEquals(List.of("October", "HORIZON"), result);
    }

    @Test
    void getStringsContainingLetterO_whenNoStringsMeetBothConditions_returnsEmptyList() {
        List<String> input = List.of("Hello", "Building", "Planet", "Two");

        StringsWithOAndMoreThanFiveLetters strings = new StringsWithOAndMoreThanFiveLetters(input);
        List<String> result = strings.getStringsContainingLetterO();

        assertEquals(List.of(), result);
    }

    @Test
    void getStringsContainingLetterO_whenInputIsEmpty_returnsEmptyList() {
        List<String> input = List.of();

        StringsWithOAndMoreThanFiveLetters strings = new StringsWithOAndMoreThanFiveLetters(input);
        List<String> result = strings.getStringsContainingLetterO();

        assertEquals(List.of(), result);
    }

}

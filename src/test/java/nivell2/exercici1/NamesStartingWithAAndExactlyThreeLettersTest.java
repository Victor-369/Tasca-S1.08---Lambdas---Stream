package nivell2.exercici1;

import com.pruebas.proyecto.nivell2.exercici1.NamesStartingWithAAndExactlyThreeLetters;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamesStartingWithAAndExactlyThreeLettersTest {
    @Test
    void getNamesStartingWithAAndExactlyThreeLetters_whenNamesMeetBothConditions_returnsMatchingNames() {
        List<String> names = List.of("Amy", "Ann", "Ada", "Ava", "Alex", "alf", "Ben");

        List<String> matchingNames =
                NamesStartingWithAAndExactlyThreeLetters.getNamesStartingWithAAndExactlyThreeLetters(names);

        assertEquals(List.of("Amy", "Ann", "Ada", "Ava"), matchingNames);
    }

    @Test
    void getNamesStartingWithAAndExactlyThreeLetters_whenNoNamesMeetBothConditions_returnsEmptyList() {
        List<String> names = List.of("Alex", "alf", "Ben", "Anna");

        List<String> matchingNames =
                NamesStartingWithAAndExactlyThreeLetters.getNamesStartingWithAAndExactlyThreeLetters(names);

        assertEquals(List.of(), matchingNames);
    }

    @Test
    void getNamesStartingWithAAndExactlyThreeLetters_whenNamesListIsEmpty_returnsEmptyList() {
        List<String> names = List.of();

        List<String> matchingNames =
                NamesStartingWithAAndExactlyThreeLetters.getNamesStartingWithAAndExactlyThreeLetters(names);

        assertEquals(List.of(), matchingNames);
    }
}

package nivell2.exercici2;

import com.pruebas.proyecto.nivell2.exercici2.EvenOddNumberFormatter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddNumberFormatterTest {
    @Test
    void formatNumbers_whenGivenMixedEvenAndOddIntegers_returnsPrefixedCommaSeparatedNumbers() {
        List<Integer> integers = List.of(3, 55, 44);

        String formattedNumbers = EvenOddNumberFormatter.formatNumbers(integers);

        assertEquals("o3, o55, e44", formattedNumbers);
    }

    @Test
    void formatNumbers_whenGivenEmptyList_returnsEmptyString() {
        List<Integer> integers = List.of();

        String formattedNumbers = EvenOddNumberFormatter.formatNumbers(integers);

        assertEquals("", formattedNumbers);
    }

    @Test
    void formatNumbers_whenGivenNegativeNumbersAndZero_usesTheirParity() {
        List<Integer> integers = List.of(-3, -4, 0);

        String formattedNumbers = EvenOddNumberFormatter.formatNumbers(integers);

        assertEquals("o-3, e-4, e0", formattedNumbers);
    }
}

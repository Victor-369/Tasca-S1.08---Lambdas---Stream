package nivell1.exercici8;

import com.pruebas.proyecto.nivell1.exercici8.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void reverseAndPrint_whenGivenString_printsItReversed() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));

            Main.reverseAndPrint("Hello");

            assertEquals("olleH" + System.lineSeparator(), output.toString(StandardCharsets.UTF_8));
        } finally {
            System.setOut(originalOutput);
        }
    }

    @Test
    void reverseAndPrint_whenGivenEmptyString_printsEmptyLine() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));

            Main.reverseAndPrint("");

            assertEquals(System.lineSeparator(), output.toString(StandardCharsets.UTF_8));
        } finally {
            System.setOut(originalOutput);
        }
    }
}

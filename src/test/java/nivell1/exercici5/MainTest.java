package nivell1.exercici5;

import com.pruebas.proyecto.nivell1.exercici5.PiValue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void getPiValue_whenInvoked_returnsAssignedValue() {
        PiValue piValue = () -> 3.1415;

        assertEquals(3.1415, piValue.getPiValue());
    }
}

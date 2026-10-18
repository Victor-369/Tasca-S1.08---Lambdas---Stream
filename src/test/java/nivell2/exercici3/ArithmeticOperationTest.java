package nivell2.exercici3;

import com.pruebas.proyecto.nivell2.exercici3.OperationsDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticOperationTest {
    private static final float DELTA = 0.0001f;

    @Test
    void calculateResult_whenAddingNumbers_returnsTheirSum() {
        assertEquals(6.0f, OperationsDemo.calculateResult(OperationsDemo.ADD, 3, 3), DELTA);
    }

    @Test
    void calculateResult_whenSubtractingNumbers_returnsTheirDifference() {
        assertEquals(-2.0f, OperationsDemo.calculateResult(OperationsDemo.SUBTRACT, 3, 5), DELTA);
    }

    @Test
    void calculateResult_whenMultiplyingNumbers_returnsTheirProduct() {
        assertEquals(12.0f, OperationsDemo.calculateResult(OperationsDemo.MULTIPLY, 3, 4), DELTA);
    }

    @Test
    void calculateResult_whenDividingNumbers_returnsTheirQuotient() {
        assertEquals(1.5f, OperationsDemo.calculateResult(OperationsDemo.DIVIDE, 3, 2), DELTA);
    }

    @Test
    void calculateResult_whenDividingByNegativeNumber_returnsNegativeQuotient() {
        assertEquals(-1.5f, OperationsDemo.calculateResult(OperationsDemo.DIVIDE, 3, -2), DELTA);
    }

    @Test
    void calculateResult_whenDividingByZero_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> OperationsDemo.calculateResult(OperationsDemo.DIVIDE, 3, 0));
    }
}

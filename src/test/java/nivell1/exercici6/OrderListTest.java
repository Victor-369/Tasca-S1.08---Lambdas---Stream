package nivell1.exercici6;

import com.pruebas.proyecto.nivell1.exercici6.OrderList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderListTest {
    @Test
    void getOrderedWords_whenListContainsNumbersAndWords_ordersWordsAndPutsNumbersAtTheEnd() {
        List<Object> input = List.of("pear", 7, "a", 2.5, "plum", "watermelon");
        OrderList orderList = new OrderList(input);

        List<Object> result = orderList.getOrderedWords();

        assertEquals(List.of("a", "pear", "plum", "watermelon", 7, 2.5), result);
    }

    @Test
    void getOrderedWords_whenListContainsOnlyWords_ordersFromShortestToLongest() {
        List<Object> input = List.of("elephant", "a", "pear", "cat");
        OrderList orderList = new OrderList(input);

        List<Object> result = orderList.getOrderedWords();

        assertEquals(List.of("a", "cat", "pear", "elephant"), result);
    }

    @Test
    void getOrderedWords_whenListContainsOnlyNumbers_preservesNumbersInOrder() {
        List<Object> input = List.of(7, 2.5, -3);
        OrderList orderList = new OrderList(input);

        List<Object> result = orderList.getOrderedWords();

        assertEquals(input, result);
    }

    @Test
    void getOrderedWords_whenListIsEmpty_returnsEmptyList() {
        OrderList orderList = new OrderList(List.of());

        List<Object> result = orderList.getOrderedWords();

        assertEquals(List.of(), result);
    }
}

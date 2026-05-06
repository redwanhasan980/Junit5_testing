import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add_shouldReturnSumOfTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void subtract_shouldReturnDifferenceOfTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(5, 2);

        assertEquals(4, result);
    }
}
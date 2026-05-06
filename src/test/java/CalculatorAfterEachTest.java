import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorAfterEachTest {
    private Calculator calculator;
    @BeforeEach
 void setUp()
 {
      calculator = new Calculator();
      System.out.println("setUp ");


 }

 @AfterEach
 void teardown()
 {
     calculator=null;
     System.out.println("Teardown");
 }

 @Order(1)
    @Test
    void add_shouldReturnSumOfTwoNumbers() {


        int result = calculator.add(2, 3);

        assertEquals(4, result);
        System.out.println("after add");
    }

    @Order(1)
    @Test
    void subtract_shouldReturnDifferenceOfTwoNumbers() {


        int result = calculator.subtract(5, 2);

        assertEquals(3, result);
        System.out.println("after sub");
    }
}
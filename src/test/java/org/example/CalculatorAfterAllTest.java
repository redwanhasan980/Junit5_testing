package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorAfterAllTest {
    private static Calculator calculator;
 @BeforeAll
 static void setUp()
 {
      calculator = new Calculator();
      System.out.println("setup ");

 }
 @AfterAll
 static  void tearDown()
 {
     calculator=null;
     System.out.println("tearDown");
 }
 @Order(1)
    @Test
    void add_shouldReturnSumOfTwoNumbers() {


        int result = calculator.add(2, 3);

        assertEquals(5, result);
        System.out.println("after add");
    }

    @Order(2)
    @Test
    void subtract_shouldReturnDifferenceOfTwoNumbers() {


        int result = calculator.subtract(5, 2);

        assertEquals(3, result);
        System.out.println("after sub");
    }
}
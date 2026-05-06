package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Calculator Test")
class CalculatorTest {
@DisplayName("Addition")
    @Test
    void add() {
        Calculator calculator = new Calculator();
        int res=calculator.add(5,4);
        assertEquals(9,res,"addition issue");
    }
@DisplayName("Sub")
    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int res=calculator.subtract(5,4);
        assertEquals(1,res,"addition issue");
    }
}
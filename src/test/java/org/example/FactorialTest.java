package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactorialTest {
    @Test
    void factorialtest()
    {
        Factorial f1 = new Factorial();
        int r=f1.factorial(5);
        assertEquals(120,r);
    }
}

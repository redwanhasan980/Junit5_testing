package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FactorialTest {
    @Test
    void factorialtest()
    {
        Factorial f1 = new Factorial();
        int r=f1.factorial(5);
        assertEquals(120,r);
    }
    @Test
    void factorialTest2()
    {
         Factorial f1 = new Factorial();
         int res=f1.factorial(5);
         assertNotEquals(120,res);
    }
}

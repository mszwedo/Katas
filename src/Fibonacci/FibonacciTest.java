package Fibonacci;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {


    @Test
    public void testNumbers()
    {
        assertEquals(2, Fibonacci.recursiveFib(3));
        assertEquals(2, Fibonacci.iterativeFib(3));
        assertEquals(2, Fibonacci.goldenFib(3));

        assertEquals(3, Fibonacci.recursiveFib(4));
        assertEquals(3, Fibonacci.iterativeFib(4));
        assertEquals(3, Fibonacci.goldenFib(4));

        assertEquals(5, Fibonacci.recursiveFib(5));
        assertEquals(5, Fibonacci.iterativeFib(5));
        assertEquals(5, Fibonacci.goldenFib(5));

        assertEquals(8, Fibonacci.recursiveFib(6));
        assertEquals(8, Fibonacci.iterativeFib(6));
        assertEquals(8, Fibonacci.goldenFib(6));
    }

    @Test
    public void testLargeNumbers()
    {
        assertEquals(6765, Fibonacci.recursiveFib(20));
        assertEquals(6765, Fibonacci.iterativeFib(20));
        assertEquals(6765, Fibonacci.goldenFib(20));

        assertEquals(102334155, Fibonacci.iterativeFib(40));
        assertEquals(102334155, Fibonacci.goldenFib(40));
    }
}

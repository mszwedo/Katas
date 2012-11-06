package FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest
{

    @Test
    public void testInvalidNumber()
    {
        assertEquals("", FizzBuzz.fizzbuzz(-1));
        assertEquals("", FizzBuzz.fizzbuzz(0));
    }


    @Test
    public void testValidNumbers()
    {
        assertEquals("1 2", FizzBuzz.fizzbuzz(2));
        assertEquals("1 2 fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("1 2 fizz 4 buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz", FizzBuzz.fizzbuzz(15));
    }
}

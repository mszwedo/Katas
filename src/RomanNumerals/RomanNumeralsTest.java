package RomanNumerals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 9/11/12
 * Time: 6:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class RomanNumeralsTest
{

    @Test
    public void testOne()
    {
        assertEquals("I", RomanNumerals.convertToRomanNumeral(1));
    }

    @Test
    public void testTwo()
    {
        assertEquals("II", RomanNumerals.convertToRomanNumeral(2));
    }

    @Test
    public void testThree()
    {
        assertEquals("III", RomanNumerals.convertToRomanNumeral(3));
    }

    @Test
    public void testFour()
    {
        assertEquals("IV", RomanNumerals.convertToRomanNumeral(4));
    }

    @Test
    public void testFive()
    {
        assertEquals("V", RomanNumerals.convertToRomanNumeral(5));
    }

    @Test
    public void testSixSevenEight()
    {
        assertEquals("VI", RomanNumerals.convertToRomanNumeral(6));
        assertEquals("VII", RomanNumerals.convertToRomanNumeral(7));
        assertEquals("VIII", RomanNumerals.convertToRomanNumeral(8));
    }

    @Test
    public void testNine()
    {
        assertEquals("IX", RomanNumerals.convertToRomanNumeral(9));
    }

    @Test
    public void testOthers()
    {
        assertEquals("X", RomanNumerals.convertToRomanNumeral(10));
        assertEquals("XVII", RomanNumerals.convertToRomanNumeral(17));
        assertEquals("XXII", RomanNumerals.convertToRomanNumeral(22));
    }

}

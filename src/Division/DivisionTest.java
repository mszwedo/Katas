package Division;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DivisionTest {

    @Test
    public void sameTest()
    {
        assertEquals(1, Division.divide(3,3));
        assertEquals(1, Division.divide(9,9));
    }

    @Test
    public void ZeroNumeratorTest()
    {
        assertEquals(0, Division.divide(0,6));
    }

    @Test
    public void divideWholeNumbersTest()
    {
        assertEquals(3, Division.divide(9,3));
        assertEquals(2, Division.divide(4,2));
    }

    //////////////////////////////////////////
    //quickDivide

    @Test
    public void sameQDTest()
    {
        assertEquals("1 R 0", Division.quickDivide(3,3));
        assertEquals("1 R 0", Division.quickDivide(9,9));
    }

    @Test
    public void ZeroNumeratorQDTest()
    {
        assertEquals("0 R 0", Division.quickDivide(0,6));
    }

    @Test
    public void divideWholeNumbersQDTest()
    {
        assertEquals("3 R 0", Division.quickDivide(9,3));
        assertEquals("2 R 0", Division.quickDivide(4,2));
        assertEquals("13 R 0", Division.quickDivide(39,3));
    }
}

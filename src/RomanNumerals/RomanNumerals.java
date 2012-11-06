package RomanNumerals;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 9/11/12
 * Time: 6:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class RomanNumerals
{

    private static final int[]    values =  {100 , 90  , 50, 40  ,10 , 9 ,  5 , 4 , 1};
    private static final String[] symbols = {"C" , "XC","L", "XL","X","IX","V","IV","I"};

    public static String convertToRomanNumeral(int num)
    {
        StringBuilder result = new StringBuilder();

        int remaining = num;

        for (int i = 0; i < values.length; i++)
            remaining = appendRomanNumerals(remaining, values[i], symbols[i], result);

        return result.toString();
    }

    private static int appendRomanNumerals(int num, int value, String roman, StringBuilder result)
    {
        int remaining = num;
        while (remaining >= value)
        {
            result.append(roman);
            remaining = remaining - value;
        }
        return remaining;
    }
}

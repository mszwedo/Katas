package Division;


public class Division {

    public static int divide(int numerator, int denominator)
    {
        if (numerator == denominator)
            return 1;
        else if(numerator == 0)
            return 0;
        //else if(denominator == 0)
            //throw new divideByZeroException();

        int sign = (numerator * denominator > 0) ? 1 : -1;

        if(numerator < 0)
            numerator *= -1;
        if(denominator < 0)
            denominator *= -1;

        int result = 0;

        while (true) {
            numerator = numerator - denominator;
            if(numerator>=0)
                result++;
            else
                break;
        }

        return (sign*result);
    }


    public static String quickDivide(int num, int denom)
    {
        int quotBits = 1; // start with a single bit quotient
        int quot = 0;

        // get number of quotient bits
        while (Math.pow(2,quotBits) * denom < num)
        {
            quotBits++;
        }

        for (int bitExp = quotBits - 1; bitExp >= 0; bitExp--)
        {
            if (num >= Math.pow(2, bitExp)* denom)
            {
                // add to quotient and subtract from numerator
                quot += Math.pow(2,bitExp);
                num -= Math.pow(2, bitExp) * denom;
            }
        }

        // numerator is holding remainder
        return String.format("%1$d R %2$d", quot, num);
    }
}

package Fibonacci;


public class Fibonacci
{
    public static int recursiveFib(int n)
    {
        if (n < 2)
            return n;

        return recursiveFib(n-1)+recursiveFib(n-2);
    }

    public static int iterativeFib(int n) {

        if (n < 2)
            return n;

        int n2 = 0;
        int n1 = 1;
        int total = 0;

        for (int i = 2; i <= n; i++)
        {
            total = n1 + n2;
            n2 = n1;
            n1 = total;
        }

        return total;
    }

    public static int goldenFib(int n) {

        double phi = 1.61803398874989484820458683436563811772030917980576286213544862270526046281890;
        //double squareRootFive = Math.sqrt(5);
        double squareRootFive = 2.23606797749978969640917366873127623544061835961152;

        //return (int) ((Math.pow(phi,n) - Math.pow(-phi,-n)) / squareRootFive);

        double arg0 = Math.pow(phi,n);
        double arg1 = -1 / arg0;

        return (int) ((arg0 - arg1) / squareRootFive);
    }

}

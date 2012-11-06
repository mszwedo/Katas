package Fibonacci;


public class Fibonacci
{
    public static int recursiveFib(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return recursiveFib(n-1)+recursiveFib(n-2);
        }
    }

    public static int iterativeFib(int n) {
        int prev1=0;
        int prev2=1;

        for(int i=0; i<n; i++)
        {
            int savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1 + prev2;
        }
        return prev1;
    }

    public static int goldenFib(int n) {

        double phi = 1.61803398874989484820458683436563811772030917980576286213544862270526046281890;
        int result = 0;

        result = (int) ((Math.pow(phi,n) - Math.pow(-phi,-n)) / Math.sqrt(5));

        return result;
    }

}

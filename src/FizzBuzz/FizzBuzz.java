package FizzBuzz;


public class FizzBuzz {

    public static String fizzbuzz(int n)
    {
        if (n < 1)
            return "";

        StringBuilder fb = new StringBuilder();
        for (int i = 1; i <= n; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
                fb.append("fizzbuzz ");
            else if (i % 3 == 0)
                fb.append("fizz ");
            else if (i % 5 == 0)
                fb.append("buzz ");
            else
                fb.append(i + " ");
        }

        return fb.substring(0, fb.length()-1);
    }
}

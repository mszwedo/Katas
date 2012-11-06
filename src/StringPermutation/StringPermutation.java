package StringPermutation;


public class StringPermutation {


    private static StringBuilder display;

    public static String permute(String s)
    {
        display = new StringBuilder();

        permutateString(new StringBuilder(s), 0, s.length()-1);

        return display.toString();
    }

    private static void permutateString(StringBuilder str, int start, int end)
    {
        if (start == end)
            display.append(str.toString() + " ");
        else {
            for (int i = start; i <= end; i++) {
                swap(str, start, i);
                permutateString(str, start+1, end);
                swap(str, start, i);
            }
        }
    }

    private static void swap(StringBuilder s, int i, int j)
    {
        char temp = s.charAt(i);
        s.setCharAt(i,s.charAt(j));
        s.setCharAt(j,temp);
    }
}

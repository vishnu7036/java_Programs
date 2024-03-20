package programs;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String value = "eat";
        String[] ss = {"ate", "tea"};
        String s1 = ss[0];
        String s2 = ss[1];

            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            char[] v1 = value.toLowerCase().toCharArray();
            Arrays.sort(v1);
            boolean b = Arrays.equals(v1, c1) && Arrays.equals(v1, c2);
            if (b)
                System.out.println("given strings are Anagram");
    }
}

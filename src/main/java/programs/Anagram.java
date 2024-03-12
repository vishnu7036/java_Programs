package programs;

import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String value = "eat";
        String[] ss = {"ate", "tea"};
        String s1 = ss[0];
        String s2 = ss[1];

        if (s1.length() != value.length() || s2.length() != value.length()) {
            System.out.println("Given strings are not Anagrams");
            return;
        }else{
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
}

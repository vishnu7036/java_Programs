package rufLogics;

import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {
        String s1 = "eat";
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        String[] s2 = {"ate","tea"};
        String ss2 = s2[0];
        String ss3 = s2[1];
        char[] ch2 = ss2.toCharArray();
        Arrays.sort(ch2);
        char[] ch3 = ss3.toCharArray();
        Arrays.sort(ch3);

        boolean b = Arrays.equals(ch1, ch2) && Arrays.equals(ch1, ch3);
        String f = b ? "It is Anagram" : "It is not a Anagram";
        System.out.println(f);
    }
}

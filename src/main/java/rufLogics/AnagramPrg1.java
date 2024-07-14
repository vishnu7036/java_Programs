package rufLogics;

import java.util.Arrays;

public class AnagramPrg1 {
    public static void main(String[] args) {
        String ss = "eat";
        String[] aa = {"tea","ate"};
        char[] ch = ss.toCharArray();
        char[] ch1 = aa[0].toCharArray();
        char[] ch2 = aa[1].toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean b = Arrays.equals(ch, ch1) && Arrays.equals(ch, ch2);
        if(b)
            System.out.println("Given String is Pro.Anagram ");
    }
}

package ProgramsRework;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String value = "eat";
        String[] arr = {"tea", "ate"};
        String arr1 = arr[0];
        String arr2 = arr[1];
        char[] c1 = arr1.toCharArray();
        char[] c2 = arr2.toCharArray();
        char[] v1 = value.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Arrays.sort(v1);

        boolean yes = Arrays.equals(v1, c1) && Arrays.equals(v1, c2);
        if (yes)
            System.out.println("Give program is matching with Anagram");

    }
}

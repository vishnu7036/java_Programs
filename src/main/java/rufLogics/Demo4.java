package rufLogics;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        String ss = "eAt";
        String [] arr = {"ate","tea"};
        char[] ch1 = ss.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        System.out.println(ch1);
        char[] ch2 = arr[0].toCharArray();
        Arrays.sort(ch2);
        System.out.println(ch2);
        char[] ch3 = arr[1].toCharArray();
        Arrays.sort(ch3);
        System.out.println(ch3);
        boolean Anagram = Arrays.equals(ch1,ch2) && Arrays.equals(ch1, ch3);
        if(Anagram)
            System.out.println("given strings are Anagram");
    }
}

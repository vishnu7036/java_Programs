package rufLogics;

import java.util.Arrays;
import java.util.Comparator;

public class LargeStringInProvidedString {
    public static void main(String[] args) {
        String ss = "This is vishnu pavan";
        String longWord = Arrays.stream(ss.split(" ")).max(Comparator.comparing(String::length)).orElse("");
        System.out.println(longWord);
//        String [] sp = ss.split(" ");
//        int wordLength = 0;
//        String longWord = "";
//        for(String s : sp) {
//            if (s.length() > wordLength) {
//                wordLength = s.length();
//                longWord = s;
//            }
//        }
//        System.out.println(longWord);
    }
}

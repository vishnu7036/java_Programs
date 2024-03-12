package rufLogics;

import java.util.*;

public class Sampl2 {
    public static void main(String[] args) {
        String orgString = "coconut";
        char[] ch = orgString.toCharArray();
        TreeSet<Character> lhs = new TreeSet<>();
       for(char c : ch){
           lhs.add(c);
       }
        System.out.println(lhs);
    }
}

package rufLogics;

import java.util.*;
import java.util.stream.Stream;

public class FetchUniqeLettersFromString {
    public static void main(String[] args) {
        String ss = "coconut";
        char[] ch = ss.toCharArray();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(char c : ch){
            hs.add(c);
        }
        System.out.println(hs);
            hs.stream().sorted().forEach(System.out::print);
    }
}

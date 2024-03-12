package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesAndFetchString {
    public static void main(String[] args){
        String orgString = "coconut";
        char[] ch = orgString.toCharArray();

        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(char c: ch){
            hs.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(char uniqueChar : hs){
            sb.append(uniqueChar);
        }

        System.out.println(hs);
        System.out.println(sb);
    }
}

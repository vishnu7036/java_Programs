package programsReworkFeb2026;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String[] ss = {"eat","tea","ate"};
        String s1 = ss[0];
        String s2 = ss[1];
        String s3 = ss[2];
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Arrays.sort(c3);
        boolean a = Arrays.equals(c1,c2);
        boolean b = Arrays.equals(c2,c3);
        if(a && b)
            System.out.println("Anagram");

    }
}

package programs;

import org.testng.Assert;

public class Palindrome {
    public static void main(String[] args) {
        String a = "AMMA";
        String rev = "";
        for(int i=a.length()-1; i>=0; i--){
            rev = rev+a.charAt(i);
        }
        boolean equals = a.equals(rev);
        System.out.println(equals);
//        StringBuilder sb = new StringBuilder(a);
//        StringBuilder reverse = sb.reverse();
//        if(sb.equals(reverse))
//            System.out.println("given String is a palindrome");
//        else
//            Assert.fail("Given string is not a palindrome");
    }
}

package programs;

import org.testng.Assert;

public class ReverseStringByUsingCharArray {
    public static void main(String[] args) throws InterruptedException {
        String orgString = "MOM";
//        String rev ="";
//        char[] ch = orgString.toCharArray();
//        for(int i = ch.length-1; i>=0; i--){
//            rev = rev+ch[i];
//        }
//        System.out.println(rev);
        StringBuilder sb = new StringBuilder(orgString);
        StringBuilder reverse = sb.reverse();
        String reversedString = reverse.toString();
        System.out.println(reverse);
        Thread.sleep(2000);
        Assert.assertEquals(reversedString, orgString, "its not a palindrome");
        if(orgString.equals(reversedString))
            System.out.println("It's a palindrome");

    }
}

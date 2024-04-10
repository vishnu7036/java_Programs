package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchNumberFromString {
    public static void main(String[] args) {
        String ss = "qwe123wefg34df55sdfg";
        char[] ch = ss.toCharArray();
        for(char c: ch){
//            if(Character.isAlphabetic(c))
//                System.out.println(c);
             if(Character.isDigit(c))
                System.out.println(c);
        }



//        StringBuilder num = new StringBuilder();
//        char[] ch = ss.toCharArray();
//        for(char c: ch){
//            if(Character.isDigit(c))
//                num.append(c);
//        }
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(ss);
//        StringBuilder numbers = new StringBuilder();
//        while (matcher.find()) {
//            numbers.append(matcher.group());
//        }
//        String extractedNumbers = numbers.toString();
//        System.out.println("Extracted numbers: " + extractedNumbers);
    }
}

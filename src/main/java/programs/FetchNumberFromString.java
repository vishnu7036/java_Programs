package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchNumberFromString {
    public static void main(String[] args) {
        String ss = "qwe123wefg34df55sdfg";
        StringBuilder num = new StringBuilder();
        char[] ch = ss.toCharArray();
        for(char c: ch){
            if(Character.isDigit(c))
                num.append(c);
        }
        System.out.println(num);
    }
}

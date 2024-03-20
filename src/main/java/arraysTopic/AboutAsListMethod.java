package arraysTopic;

import java.util.Arrays;
import java.util.List;

public class AboutAsListMethod {
    public static void main(String[] args) {
        String [] arr = {"vishnu", "pavan", "is", "a", "good", "boy"};
//        arr.forEach(System.out::print);
        for(String a : arr){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
        List<String> list = Arrays.asList(arr);
        list.forEach(System.out::println);
//        System.out.println(list);
//        for(String l : list){
//            System.out.println(l);
//        }
    }
}

package programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class FetchDuplicatesFromArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,20,10,90,70,50,30};
        for(int i=0; i<arr.length; i++){
            int org = 0;
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicates"+arr[j]);
                    flag = true;
                }
                org=arr[i];
            }
            System.out.println(org);
        }
//        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
//        for(int a : arr){
//            lhs.add(a);
//        }
//        System.out.println(lhs);
//        lhs.stream().sorted().forEach(System.out::println);
    }
}

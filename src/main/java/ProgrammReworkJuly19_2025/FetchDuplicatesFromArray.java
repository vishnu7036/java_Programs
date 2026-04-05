package ProgrammReworkJuly19_2025;

import java.util.*;

public class FetchDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 10, 90, 50, 20, 40};
        int count = 0;
        ArrayList<Integer> in = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean isDuplicate = false;

            // Compare value with all other elements
            for(int j=i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                    count ++;
                    System.out.println("Duplicate arr: " +arr[j]);
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                System.err.println("Unique values: " + arr[i]);
                int va = arr[i];
                in.add(va);
                Collections.sort(in);
            }

        }
        System.out.println("sorted Unique array: "+ in);
        System.out.println("Duplicate array count: "+count);



//        LinkedHashSet<Integer> ss = new LinkedHashSet<>();
//        for(int a : arr){
//            ss.add(a);
//        }
//
//        System.out.println(ss);
//        ss.stream().sorted().forEach(System.out::println);

    }
}

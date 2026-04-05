package programs;

import java.util.Arrays;

public class FetchMaxAndMinValueFromArray {
//    public static void main(String[] args) {
//        int[] arr = {10,30,5,90,50,10,60};
//        Arrays.sort(arr);
//        int min = arr[0];
//        int max = arr[arr.length-1];
//        System.out.println(min);
//        System.out.println(max);
//    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 5, 90, 50, 10, 60};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

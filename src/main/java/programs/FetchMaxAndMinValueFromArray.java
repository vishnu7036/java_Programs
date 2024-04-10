package programs;

import java.util.Arrays;

public class FetchMaxAndMinValueFromArray {
    public static void main(String[] args) {
        int[] arr = {10,30,5,90,50,10,60};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println(min);
        System.out.println(max);
    }
}

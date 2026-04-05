package programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[] arr = {90, 20, 40, 10, 50, 30, 100};

        Arrays.sort(arr); // Sort in ascending order
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] result = new int[arr.length];
        int left = 0;                  // Start of sorted array
        int right = arr.length - 1;    // End of sorted array
        int index = 0;

        // Alternate from right (max) and left (min)
        while (left <= right) {
            if (index < arr.length)
                result[index++] = arr[right--]; // max
            if (index < arr.length)
                result[index++] = arr[left++];  // min
        }

        System.out.println("Custom sorted output: " + Arrays.toString(result));
    }
}

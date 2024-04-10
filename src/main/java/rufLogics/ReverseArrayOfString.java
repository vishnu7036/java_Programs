package rufLogics;

import java.util.ArrayList;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        String[] arr = {"one","two","three","four","five"};
        String [] arr1 = new String[arr.length];
        for(int i= arr.length-1; i>=0; i--){
            arr1[i] = arr[i];
            System.out.print(arr1[i]+" ");
        }
    }
}

package programs;

import java.util.ArrayList;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        String [] arr = {"one","two","three","four","five"};
        ArrayList<String> al = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            al.add(arr[i]);
        }
        System.out.println(al);
    }
}

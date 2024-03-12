package org.example;

public class Sample4 {
    public static void main(String[] args){
        String v ="vishnu";
        String rev = "";
        for(int i=v.length()-1; i>=0; i--){
            rev += v.charAt(i);
        }
        System.out.println(rev);
    }
}

package org.example;

public class Sample {
    public static void main(String[] args) {
        String name = "i am vishnu";
        StringBuilder stringBuilder = new StringBuilder(name);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println("reverse String :"+reverse);
    }
}

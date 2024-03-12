package org.example;

public class Sample3 {
    public static void main(String[] args) {
        String a ="vishnuvvss";
        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            // Check if the character is already processed
            if (a.indexOf(currentChar, i + 1) != -1) {
                System.out.println("Duplicate character: " + currentChar);
            }
        }
    }
}

package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample1 {
    public static void main(String[] args) {
        String inputText = "Down 1100 MECANICA GENERAL";

        // Define a regular expression to match numeric values
        Pattern pattern = Pattern.compile("\\b\\d+\\b"); // \b indicates word boundaries

        // Create a Matcher object
        Matcher matcher = pattern.matcher(inputText);

        // Find and print all numeric values if they exist
        while (matcher.find()) {
            String numericValue = matcher.group();
            System.out.println("Numeric Value: " + numericValue);
        }
    }
}

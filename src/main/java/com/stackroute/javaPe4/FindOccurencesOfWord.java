/*
Write a java program to count the total number of occurrences of a given character in a string without using any loop?
For Example- Java is java again java again count number of occurrence of a in the given string
 */
package com.stackroute.javaPe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurencesOfWord {
    public String findOccurences(String findString, String inputString) {
        if (findString == null || inputString == null) {
            return "Null input is not expected";
        }
        if (findString.length() == 0) {
            return "finder Stirng should not be of zero size";
        }
        // Use pattern matcher to find the occurences of the word.
        Pattern pattern = Pattern.compile(findString);
        Matcher matcher = pattern.matcher(inputString);
        String resultantString = new String();
        while (matcher.find()) {
            resultantString = resultantString.concat("found at " + matcher.start() + " " + matcher.end() + " ");
        }
        if (resultantString.length() > 0) {
            return resultantString;
        } else {
            return "The substring is Not found in input String";
        }
    }
}

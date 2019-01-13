/*
Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 Input : She sells seashells by the seashore
 Given word: se
 Output :
        Found at: 4 - 6
        Found at: 10 - 12
       Found at: 27 - 29
 */
package com.stackroute.javaPe4;

public class NumOfOccurcencesOfCharecter {
    public int findOccurenceOfCharecter(String replacementCharecter, String inputString) {
        if (replacementCharecter == null || inputString == null)
            return -1;
        int originalLength = inputString.length();
        String modifiedInputString = inputString.replaceAll(replacementCharecter, "");
        int modifiedLength = originalLength - modifiedInputString.length();
        return modifiedLength;
    }
}

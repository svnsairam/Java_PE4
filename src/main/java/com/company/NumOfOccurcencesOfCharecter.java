package com.company;

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
